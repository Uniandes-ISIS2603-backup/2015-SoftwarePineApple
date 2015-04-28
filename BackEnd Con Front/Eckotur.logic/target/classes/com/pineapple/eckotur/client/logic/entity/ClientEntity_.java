package com.pineapple.eckotur.client.logic.entity;

import java.util.ArrayList;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2015-04-23T10:28:44")
@StaticMetamodel(ClientEntity.class)
public class ClientEntity_ { 

    public static volatile SingularAttribute<ClientEntity, String> birthday;
    public static volatile SingularAttribute<ClientEntity, String> lastName;
    public static volatile SingularAttribute<ClientEntity, String> name;
    public static volatile SingularAttribute<ClientEntity, Integer> userType;
    public static volatile SingularAttribute<ClientEntity, Integer> creditCard;
    public static volatile SingularAttribute<ClientEntity, Long> userId;
    public static volatile SingularAttribute<ClientEntity, String> email;
    public static volatile SingularAttribute<ClientEntity, ArrayList> cart;

}