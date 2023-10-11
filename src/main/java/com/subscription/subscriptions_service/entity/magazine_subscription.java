package com.subscription.subscriptions_service.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MAGAZINE_SUBSCRIPTION")
public class magazine_subscription {
	@Id
    @Column(name="M_NAME")
    private String m_name;
    
    @Id
    @Column(name="CUST_ID")
    private Long cust_id;
    
    @Column(name="NOOFISSUES")
    private int noOfIssues;
    
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
