package com.pineapple.eckotur.offer.logic.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OfferDTO {
	
	private Long id;
	
	private String price;
	
	private String name;
	
	private Integer type;
	
	private String webpage;
	
	private String description;
	
	private String providerName;
        
        private String email;
        
        private String bankAccount;
        
	public Long getId(){
		return id;
	}
	
	public Integer getType(){
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
        
        public String getEmail(){
            return email;
        }
        
        public String getBankAccount(){
            return bankAccount;
        }
    

	public void setId(Long Id){
		this.id=Id;
	}
	
	public void setType(Integer Type){
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
        
        public void setEmail(String email){
            this.email=email;
        }
        
        public void setBankAccount(String bankAccount){
            this.bankAccount = bankAccount;
        }
    
	
}
