package com.pineapple.eckotur.provider.logic.ejb;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.enterprise.inject.Default;

import com.pineapple.eckotur.provider.logic.api.IProviderLogic;
import com.pineapple.eckotur.provider.logic.dto.ProviderDTO;
import com.pineapple.eckotur.provider.logic.dto.ProviderPageDTO;
import com.pineapple.eckotur.provider.logic.converter.ProviderConverter;
import com.pineapple.eckotur.provider.logic.entity.ProviderEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Default
@Stateless
@LocalBean
public class ProviderLogic implements IProviderLogic {

    @PersistenceContext(unitName = "ProviderClassPU")
    protected EntityManager entityManager;

    public ProviderDTO createProvider(ProviderDTO provider) {
        ProviderEntity entity = ProviderConverter.persistenceDTO2Entity(provider);
        entityManager.persist(entity);
        return ProviderConverter.entity2PersistenceDTO(entity);
    }

    public List<ProviderDTO> getProviders() {
        Query q = entityManager.createQuery("select u from ProviderEntity u");
        return ProviderConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public ProviderPageDTO getProviders(Integer page, Integer maxRecords) {
        Query count = entityManager.createQuery("select count(u) from ProviderEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from ProviderEntity u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        ProviderPageDTO response = new ProviderPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(ProviderConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }

    public ProviderDTO getProvider(Long id) {
        return ProviderConverter.entity2PersistenceDTO(entityManager.find(ProviderEntity.class, id));
    }

    public void deleteProvider(Long id) {
        ProviderEntity entity = entityManager.find(ProviderEntity.class, id);
        entityManager.remove(entity);
    }

    public void updateProvider(ProviderDTO provider) {
        ProviderEntity entity = entityManager.merge(ProviderConverter.persistenceDTO2Entity(provider));
        ProviderConverter.entity2PersistenceDTO(entity);
    }
}
