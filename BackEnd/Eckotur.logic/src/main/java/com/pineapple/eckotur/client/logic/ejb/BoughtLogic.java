/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pineapple.eckotur.client.logic.ejb;
import com.pineapple.eckotur.client.logic.api.IBoughtLogic;
import com.pineapple.eckotur.client.logic.converter.BoughtConverter;
import com.pineapple.eckotur.client.logic.dto.BoughtDTO;
import com.pineapple.eckotur.client.logic.dto.BoughtPageDTO;
import com.pineapple.eckotur.client.logic.entity.BoughtEntity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
/**
 *
 * @author estudiante
 */
public class BoughtLogic implements IBoughtLogic {
  
    @PersistenceContext(unitName = "EckoturPU")
    protected EntityManager entityManager;

    public BoughtDTO createBuy(BoughtDTO detail) {
        BoughtEntity entity = BoughtConverter.persistenceDTO2Entity(detail);
        entityManager.persist(entity);
        return BoughtConverter.entity2PersistenceDTO(entity);
    }

    public List<BoughtDTO> getBoughtFrom(Long userId) {
        Query q = entityManager.createQuery("select u from MessageEntity u where u.userIdFrom="+userId);
        return BoughtConverter.entity2PersistenceDTOList(q.getResultList());
    }
    
    public List<BoughtDTO> getBoughtFromProvider(Long userId, Long providerId) {
        Query q = entityManager.createQuery("select u from MessageEntity u where u.userIdTo="+userId +"and u.providerIdTo="+providerId);
        return BoughtConverter.entity2PersistenceDTOList(q.getResultList());
    }
    
    public List<BoughtDTO> getBoughtFromDate(Long userId, Long IDate) {
        Query q = entityManager.createQuery("select u from MessageEntity u where u.userIdTo="+userId +"and u.dateTo="+IDate);
        return BoughtConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public BoughtPageDTO getBought(Integer page, Integer maxRecords) {
        Query count = entityManager.createQuery("select count(u) from BoughtEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from BoughtEntity u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        BoughtPageDTO response = new BoughtPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(BoughtConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }

    
}
