package com.pineapple.eckotur.offer.logic.ejb;

import com.pineapple.eckotur.offer.logic.api.ICatalogLogic;
import com.pineapple.eckotur.offer.logic.dto.OfferDTO;
import com.pineapple.eckotur.offer.logic.dto.OfferPageDTO;
import com.pineapple.eckotur.offer.logic.converter.CatalogConverter;
import com.pineapple.eckotur.offer.logic.entity.OfferEntity;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless 
@LocalBean
public class OfferLogic implements ICatalogLogic {
    @PersistenceContext(unitName = "EckoturPU")
    protected EntityManager entityManager;

    public List<OfferDTO> getOffers() {
        Query q = entityManager.createQuery("select u from OfferEntity u");
        return CatalogConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public OfferPageDTO getOffers(Integer page, Integer maxRecords) {
        Query count = entityManager.createQuery("select count(u) from OfferEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from OfferEntity u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        OfferPageDTO response = new OfferPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(CatalogConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }

    public OfferDTO getOffer(Long id) {
        return CatalogConverter.entity2PersistenceDTO(entityManager.find(OfferEntity.class, id));
    }
}
