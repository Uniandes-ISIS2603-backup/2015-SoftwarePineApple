package com.pineapple.eckotur.provider.logic.dto;

import java.sql.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SaleDTO {
	
    private Long transactionId;

    private Long clientId;

    private Long providerId;

    private Long offerId;

    private Date date;

    private Long value;

    private Integer quantity;

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

    public Long getValue(){
            return value;
    }

    public Integer getQuantity(){
            return quantity;
    }

    public void setTransactionId(Long transactionId){
            this.transactionId=transactionId;
    }

    public void setClientId(Long clientId){
            this.clientId=clientId;
    }

    public void setProviderId(Long providerId){
            this.providerId=providerId;
    }

    public void setOfferId(Long offerId){
            this.offerId=offerId;
    }

    public void setDate(Date date){
            this.date=date;
    }

    public void setValue(Long value){
            this.value=value;
    }

    public void setQuantity(Integer quantity){
            this.quantity=quantity;
    }
}
