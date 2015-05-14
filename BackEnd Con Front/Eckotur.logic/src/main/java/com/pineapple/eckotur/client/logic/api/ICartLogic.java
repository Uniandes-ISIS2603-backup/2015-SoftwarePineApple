/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pineapple.eckotur.client.logic.api;

import com.pineapple.eckotur.client.logic.dto.CartDTO;
import com.pineapple.eckotur.client.logic.entity.CartEntity;
import com.pineapple.eckotur.offer.logic.dto.OfferDTO;
import java.util.List;

/**
 *
 * @author estudiante
 */
public interface ICartLogic {
    
    public List<OfferDTO> getOffers(Long idClient);
    
    public CartDTO addOffer(CartEntity entity);
    
   // public void removeOffer(OfferDTO offer);
    
    public CartDTO removeOffer( CartEntity entity);
    
}
