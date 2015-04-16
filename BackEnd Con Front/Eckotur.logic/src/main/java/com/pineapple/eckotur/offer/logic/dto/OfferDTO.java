package com.pineapple.eckotur.offer.logic.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OfferDTO {
	
	private Long id;
	
	private String price;
	
	private String name;
	
	private String type;
	
	private String webpage;
	
	private String description;
	
	private String providerName;
	
	public Long getId(){
		return id;
	}
	
	public String getType(){
		return type;
	}
	
	public String getName(){
		return name;
	}

	public String getWebpage(){
		return webpage;
	}
	
	public String getDescription(){
		return description;
	}
    

	public void setId(Long Id){
		this.id=Id;
	}
	
	public void setType(String Type){
		this.type=Type;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	
	public void setWebpage(String webpage){
		this.webpage=webpage;
	}
	
	public void setDescription(String description){
		this.description=description;
	}
    
	
}
