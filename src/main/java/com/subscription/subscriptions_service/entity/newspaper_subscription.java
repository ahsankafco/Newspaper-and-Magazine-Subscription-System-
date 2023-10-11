package com.subscription.subscriptions_service.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NEWSPAPER_SUBSCRIPTION")
public class newspaper_subscription {

    @Id
    @Column(name="N_NAME")
    private String n_name;
    
    @Id
    @Column(name="CUST_ID")
    private Long cust_id;
    
    @Column(name="TYPE")
    private String type;
    
    @Column(name="PERIOD_TYPE")
    private String period_type;
    
    @Column(name="NOOFMONTHS")
    private int noOfMonths;
    
    @Id
    @Column(name="START_DATE")
    private Date start_date;
    
    @Id
    @Column(name="END_DATE")
    private Date end_date;
    
    @Column(name="IS_ACTIVE")
    private char is_active;
    
    @Column(name="PRICE")
    private double price;
     
    
}
