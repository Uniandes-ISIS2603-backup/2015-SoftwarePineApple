package com.pineapple.eckotur.provider.logic.ejb;

import com.pineapple.eckotur.provider.logic.api.ISaleLogic;
import com.pineapple.eckotur.provider.logic.converter.SaleConverter;
import com.pineapple.eckotur.provider.logic.dto.SaleDTO;
import com.pineapple.eckotur.provider.logic.dto.SalePageDTO;
import com.pineapple.eckotur.provider.logic.entity.SaleEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class SaleLogic implements ISaleLogic {

    @PersistenceContext(unitName = "EckoturPU")
    protected EntityManager entityManager;

    public SaleDTO createSale(SaleDTO sale) {
        SaleEntity entity = SaleConverter.persistenceDTO2Entity(sale);
        entityManager.persist(entity);
        return SaleConverter.entity2PersistenceDTO(entity);
    }

    public List<SaleDTO> getSalesByClient(Long sellerId, Long clientId) {
        Query q = entityManager.createQuery("select u from SaleEntity u where u.clientId="+clientId+" and u.sellerId="+sellerId);
        return SaleConverter.entity2PersistenceDTOList(q.getResultList());
    }
    
    public List<SaleDTO> getSalesByTransaction(Long sellerId, Long transactionId) {
        Query q = entityManager.createQuery("select u from SaleEntity u where u.transactionId="+transactionId+" and u.sellerId="+sellerId);
        return SaleConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public SalePageDTO getSales(Long sellerId, Integer page, Integer maxRecords) {
        Query count = entityManager.createQuery("select count(u) from SaleEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from SaleEntity u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        SalePageDTO response = new SalePageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(SaleConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }

    public SaleDTO getSale(Long id) {
        return SaleConverter.entity2PersistenceDTO(entityManager.find(SaleEntity.class, id));
    }
}
