package com.pineapple.eckotur.offer.logic.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OfferDTO {
	
	private Long id;
	
        private String name;
	
	private Long providerId;
	
	private String location;
	
	private String description;
	
	private Long price;
        
        private String date;
        
        
        
	public Long getId(){
		return id;
	}
	
	public Long getProviderId(){
		return providerId;
	}
	
	public String getName(){
		return name;
	}

	public String getLocation(){
		return location;
	}
	
	public String getDescription(){
		return description;
	}
        
        public Long getPrice(){
            return price;
        }
        
        public String getDate(){
            return date;
        }
    

	public void setId(Long Id){
		this.id=Id;
	}
	
	public void setProviderId(Long providerId){
		this.providerId=providerId;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	
	public void setLocation(String Location){
		this.location=location;
	}
	
	public void setDescription(String description){
		this.description=description;
	}
        
        public void setPrice(Long price){
            this.price=price;
        }
        
        public void setDate(String date){
            this.date = date;
        }
    
	
}
