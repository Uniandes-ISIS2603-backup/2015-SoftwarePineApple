package com.pineapple.eckotur.provider.logic.ejb;

import com.pineapple.eckotur.provider.logic.api.ISaleLogic;
import com.pineapple.eckotur.provider.logic.converter.SaleConverter;
import com.pineapple.eckotur.provider.logic.dto.SaleDTO;
import com.pineapple.eckotur.provider.logic.entity.SaleEntity;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless 
@LocalBean
public class SaleLogic implements ISaleLogic {

    @PersistenceContext(unitName = "EckoturPU")
    protected EntityManager entityManager;

    public SaleDTO createSale(SaleDTO detail) {
        SaleEntity entity = SaleConverter.persistenceDTO2Entity(detail);
        entityManager.persist(entity);
        return SaleConverter.entity2PersistenceDTO(entity);
    }

    public List<SaleDTO> getSalesByClient(Long providerId, Long clientId) {
        Query q = entityManager.createQuery("select u from SaleEntity u where u.clientId="+clientId+" and u.providerId="+providerId);
        return SaleConverter.entity2PersistenceDTOList(q.getResultList());
    }
    
    public List<SaleDTO> getSalesByTransaction(Long providerId, Long transactionId) {
        Query q = entityManager.createQuery("select u from SaleEntity u where u.transactionId="+transactionId+" and u.providerId="+providerId);
        return SaleConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public List<SaleDTO> getSales(Long providerId) {
        Query q = entityManager.createQuery("select u from SaleEntity u where u.providerId="+providerId);
        return SaleConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public SaleDTO getSale(Long id) {
        return SaleConverter.entity2PersistenceDTO(entityManager.find(SaleEntity.class, id));
    }
}
