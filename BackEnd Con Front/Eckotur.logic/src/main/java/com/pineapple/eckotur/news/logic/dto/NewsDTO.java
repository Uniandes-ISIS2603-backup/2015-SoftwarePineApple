package com.pineapple.eckotur.news.logic.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NewsDTO {
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
