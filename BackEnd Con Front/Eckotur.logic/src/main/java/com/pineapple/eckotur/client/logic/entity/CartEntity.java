/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pineapple.eckotur.client.logic.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author estudiante
 */
@Entity
public class CartEntity {
    @Id Long idClient;
    @Id Long idOffer;
    
    //private Long idClient;
    
    //private Long idOffer;
    
    public Long getIdCLient(){
        return idClient;
    }
    
    public Long getIdOffer(){
        return idOffer;
    }
    
    public void setIdClient(Long pIdClient){
        idClient = pIdClient;
    }
    
    public void setIdOffer(Long pIdOffer){
        idOffer = pIdOffer;
    }
    
}
