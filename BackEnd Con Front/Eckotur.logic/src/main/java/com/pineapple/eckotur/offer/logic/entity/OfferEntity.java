package com.pineapple.eckotur.offer.logic.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OfferEntity {

    @Id
    @GeneratedValue(generator = "Offer")
    private Long Id;
	
    private Long providerId;

    private String name;

    private String description;

    private String location;

    private String date;

    private Long price;

    public Long getId(){
            return Id;
    }

    public Long getProviderId(){
            return providerId;
    }
    public String getName(){
            return name;
    }
    public String getDescription(){
            return description;
    }

    public String getDate(){
            return date;
    }

    public Long getPrice(){
            return price;
    }

    public String getLocation(){
            return location;
    }
    

    public void setId(Long Id){
            this.Id=Id;
    }

    public void setProviderId(Long providerId){
            this.providerId=providerId;
    }

    public void setName(String name){
            this.name=name;
    }

    public void setLocation(String location){
            this.location=location;
    }

    public void setPrice(Long price){
            this.price=price;
    }

    public void setDescription(String description){
            this.description=description;
    }

    public void setDate(String date){
            this.date=date;
    }
}
