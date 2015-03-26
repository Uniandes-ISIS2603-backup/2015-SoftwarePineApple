/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pineapple.eckotur.client.logic.entity;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BoughtEntity {

    @Id
    @GeneratedValue(generator = "Message")
    
	
	private Long userId;
	
	private Long providerId;
	
	private Long date;
	
	private Long transactionId;
	
	private Long offerId;
	
	public Long getUserId(){
		return userId;
	}
	public Long getProviderId(){
		return providerId;
	}
	public Long getDate(){
		return date;
	}
	public Long getTransactionId(){
		return transactionId;
	}
	public Long getOfferId(){
		return offerId;
	}
	
	public void setUserId(Long id){
		this.userId=id;
	}
	
	public void setProviderId(Long IProviderId){
		this.providerId=IProviderId;
	}
	
	public void setDate(Long IDate){
		this.date=IDate;
	}
	
	public void setTransactionId(Long ITransactionId){
		this.transactionId=ITransactionId;
	}
	
	public void setMessage(Long IOfferId){
		this.offerId=IOfferId;
	}
	

}
