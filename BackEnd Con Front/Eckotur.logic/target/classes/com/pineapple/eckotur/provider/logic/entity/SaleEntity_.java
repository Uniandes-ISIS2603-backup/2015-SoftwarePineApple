package com.pineapple.eckotur.provider.logic.entity;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2015-05-07T10:26:59")
@StaticMetamodel(SaleEntity.class)
public class SaleEntity_ { 

    public static volatile SingularAttribute<SaleEntity, Long> transactionId;
    public static volatile SingularAttribute<SaleEntity, Long> value;
    public static volatile SingularAttribute<SaleEntity, Long> providerId;
    public static volatile SingularAttribute<SaleEntity, Integer> quantity;
    public static volatile SingularAttribute<SaleEntity, Date> date;
    public static volatile SingularAttribute<SaleEntity, Long> clientId;
    public static volatile SingularAttribute<SaleEntity, Long> offerId;

}