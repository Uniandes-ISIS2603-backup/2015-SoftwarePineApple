/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pineapple.eckotur.client.logic.dto;
import java.sql.Date;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author estudiante
 */
public class BoughtDTO {
	
    

    private Long clientId;

    private Long providerId;

    private Long offerId;

    private Date date;

    private Long transactionId;

    

    public Long getTransactionId(){
            return transactionId;
    }

    public Long getClientId(){
            return clientId;
    }

    public Long getProviderId(){
            return providerId;
    }

    public Long getOfferId(){
            return offerId;
    }

    public Date getDate(){
            return date;
    }

    
    public void setTransactionId(Long transactionId){
            this.transactionId=transactionId;
    }



   
}
