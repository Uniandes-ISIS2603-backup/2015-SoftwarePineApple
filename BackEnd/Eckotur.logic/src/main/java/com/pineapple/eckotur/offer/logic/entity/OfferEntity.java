package com.pineapple.eckotur.offer.logic.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OfferEntity {

    @Id
    @GeneratedValue(generator = "Provider")
    private Long userId;
	
	private Integer userType;
	
	private String name;
	
	private String email;
	
	private String webpage;
	
	private String description;
	
	private String bankAccount;
	
	public Long getUserId(){
		return userId;
	}
	
	public Integer getUserType(){
		return userType;
	}
	
	public String getName(){
		return name;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getWebpage(){
		return webpage;
	}
	
	public String getDescription(){
		return description;
	}
    
	public String getBankAccount(){
		return bankAccount;
	}

	public void setUserId(Long userId){
		this.userId=userId;
	}
	
	public void setUserType(Integer userType){
		this.userType=userType;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	public void setWebpage(String webpage){
		this.webpage=webpage;
	}
	
	public void setDescription(String description){
		this.description=description;
	}
    
	public void setBankAccount(String bankAccount){
		this.bankAccount=bankAccount;
	}
}
