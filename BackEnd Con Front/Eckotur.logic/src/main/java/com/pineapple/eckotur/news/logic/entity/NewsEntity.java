package com.pineapple.eckotur.news.logic.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class NewsEntity {
    @Id
    @GeneratedValue(generator = "News")
    private Long id;
	
    private Long authorId;

    private String title;

    private String message;
    
    public Long getId(){
        return id;
    }
    
    public Long getAuthorId(){
        return authorId;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getMessage(){
        return message;
    }
            
    public void setId(Long id){
        this.id=id;
    }
    
    public void setAuthorId(Long authorId){
        this.authorId=authorId;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    
    public void setMessage(String message){
        this.message=message;
    }
}