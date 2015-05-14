/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pineapple.eckotur.client.logic.converter;

import com.pineapple.eckotur.client.logic.dto.CartDTO;
import com.pineapple.eckotur.client.logic.entity.CartEntity;



/**
 *
 * @author estudiante
 */
public class CartConverter {
    
        public static CartDTO entity2PersistenceDTO(CartEntity entity) {
        if (entity != null) {
        	CartDTO dto = new CartDTO();	
                dto.setIdClient(entity.getIdCLient());
                dto.setIdOffer(entity.getIdOffer());
            return dto;
        } else {
            return null;
        }
    }
        
           public static CartEntity persistenceDTO2Entity(CartDTO dto) {
        if (dto != null) {
        	CartEntity entity = new CartEntity();
        	entity.setIdClient(dto.getIdCLient());
        	entity.setIdOffer(dto.getIdOffer());
            return entity;
        } else {
            return null;
        }
    }
    
}
