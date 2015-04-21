package com.pineapple.eckotur.news.logic.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2015-04-21T10:23:23")
@StaticMetamodel(NewsEntity.class)
public class NewsEntity_ { 

    public static volatile SingularAttribute<NewsEntity, Long> id;
    public static volatile SingularAttribute<NewsEntity, Long> authorId;
    public static volatile SingularAttribute<NewsEntity, String> title;
    public static volatile SingularAttribute<NewsEntity, String> message;

}