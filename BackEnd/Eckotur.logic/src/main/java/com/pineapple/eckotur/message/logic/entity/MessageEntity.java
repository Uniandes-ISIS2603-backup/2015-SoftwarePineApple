package com.pineapple.eckotur.message.logic.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MessageEntity {

    @Id
    @GeneratedValue(generator = "Message")
    private Long id;
	
	private Long userIdFrom;
	
	private Long userIdTo;
	
	private String subject;
	
	private String message;
	
	private Date date;
	
	public Long getId(){
		return id;
	}
	public Long getIdUserFrom(){
		return userIdFrom;
	}
	public Long getIdUserTo(){
		return userIdTo;
	}
	public String getSubject(){
		return subject;
	}
	public String getMessage(){
		return message;
	}
	public Date getDate(){
		return date;
	}
	
	public void setId(Long id){
		this.id=id;
	}
	
	public void setIdUserFrom(Long userIdFrom){
		this.userIdFrom=userIdFrom;
	}
	
	public void setIdUserTo(Long userIdTo){
		this.userIdTo=userIdTo;
	}
	
	public void setSubject(String subject){
		this.subject=subject;
	}
	
	public void setMessage(String message){
		this.message=message;
	}
	
	public void setDate(Date date){
		this.date=date;
	}
}
