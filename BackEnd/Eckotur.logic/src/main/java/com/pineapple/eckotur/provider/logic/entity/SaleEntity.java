package com.pineapple.eckotur.provider.logic.entity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SaleEntity {

    @Id
    @GeneratedValue(generator = "Sale")
    private Long transactionId;
	
    private Long buyerId;

    private Long sellerId;

    private Long offerId;

    private Date date;

    private Long value;

    private Integer quantity;

    public Long getTransactionId(){
            return transactionId;
    }

    public Long getBuyerId(){
            return buyerId;
    }

    public Long getSellerId(){
            return sellerId;
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

    public void setBuyerId(Long buyerId){
            this.buyerId=buyerId;
    }

    public void setSellerId(Long sellerId){
            this.sellerId=sellerId;
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
