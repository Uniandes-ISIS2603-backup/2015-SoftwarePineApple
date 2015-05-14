/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pineapple.eckotur.client.logic.ejb;

import com.pineapple.eckotur.client.logic.api.ICartLogic;
import com.pineapple.eckotur.client.logic.converter.CartConverter;
import com.pineapple.eckotur.client.logic.dto.CartDTO;
import com.pineapple.eckotur.client.logic.entity.CartEntity;
import com.pineapple.eckotur.offer.logic.dto.OfferDTO;
import com.pineapple.eckotur.offer.logic.ejb.OfferLogic;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author estudiante
 */
@Stateless 
@LocalBean
public class CartLogic implements ICartLogic{
    
    @Inject
    protected OfferLogic offerLogic;


    @PersistenceContext(unitName = "EckoturPU")
    protected EntityManager entityManager;
    
    public List<OfferDTO> getOffers(Long idClient) {
        List<OfferDTO> out= new ArrayList<OfferDTO>();
        Query q = entityManager.createQuery("select u.idOffer from CartEntity u where u.idClient= "+ idClient);
        List result = q.getResultList();
        for(int i = 0; i< result.size();i++){
            out.add(offerLogic.getOffer((Long) result.get(i)));
        }
        return out;
    }

    public CartDTO addOffer(CartEntity entity) {
     
        entityManager.persist(entity);
       // entityManager.createQuery("INSERT INTO CARTENTITY (IDCLIENT, IDOFFER) VALUES (" + entity.getIdCLient()+ ", "+entity.getIdOffer()+")");
        return CartConverter.entity2PersistenceDTO(entity);
   }

    public CartDTO removeOffer(CartEntity cart) {
        CartDTO dto = CartConverter.entity2PersistenceDTO(cart);
        entityManager.remove(cart);
        return dto;
   }
    
    
    
}
