package com.pineapple.eckotur.news.logic.ejb;

import com.pineapple.eckotur.news.logic.api.INewsLogic;
import com.pineapple.eckotur.news.logic.converter.NewsConverter;
import com.pineapple.eckotur.news.logic.dto.NewsDTO;
import com.pineapple.eckotur.news.logic.dto.NewsPageDTO;
import com.pineapple.eckotur.news.logic.entity.NewsEntity;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless 
@LocalBean
public class NewsLogic implements INewsLogic {
    @PersistenceContext(unitName = "EckoturPU")
    protected EntityManager entityManager;

    public NewsDTO createNews(NewsDTO news) {
        NewsEntity entity = NewsConverter.persistenceDTO2Entity(news);
        entityManager.persist(entity);
        return NewsConverter.entity2PersistenceDTO(entity);
    }

    public List<NewsDTO> getNews() {
        Query q = entityManager.createQuery("select u from NewsEntity u");
        return NewsConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public NewsPageDTO getNews(Integer page, Integer maxRecords) {
        Query count = entityManager.createQuery("select count(u) from NewsEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from NewsEntity u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        NewsPageDTO response = new NewsPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(NewsConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }

    public NewsDTO getNews(Long id) {
        return NewsConverter.entity2PersistenceDTO(entityManager.find(NewsEntity.class, id));
    }

    public void deleteNews(Long id) {
        NewsEntity entity = entityManager.find(NewsEntity.class, id);
        entityManager.remove(entity);
    }

    public List<NewsDTO> getNewsByAuthor(Long authorId) {
        Query q = entityManager.createQuery("select u from NewsEntity u where u.authorId="+authorId);
        return NewsConverter.entity2PersistenceDTOList(q.getResultList());
    }
}
