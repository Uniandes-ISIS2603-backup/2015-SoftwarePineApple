package com.pineapple.eckotur.client.logic.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ClientDTO {
	
    private Long userId;

    private Integer userType;

    private String name;

    private String email;

    private String lastName;

    private String birthday;

    private Integer creditCard;

    public Long getUserId(){
            return userId;
    }

    public Integer getUserType(){
            return userType;
    }

    public String getName(){
            return name;
    }


    public String getLastName()
    {
        return lastName;
    }

    public String getEmail(){
            return email;
    }

    public String getBirthday(){
            return birthday;
    }

    public int getCreditCard(){
            return creditCard;
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

    public void setLastName(String nLastName)
    {
        this.lastName=nLastName;
    }

    public void setEmail(String email){
            this.email=email;
    }

    public void setBirthday(String nBirthday){
            this.birthday=nBirthday;
    }

    public void setCreditCard(int nCreditCard){
            this.creditCard=nCreditCard;
    }
}
    
	
