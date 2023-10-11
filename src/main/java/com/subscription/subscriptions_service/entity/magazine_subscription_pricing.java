package com.subscription.subscriptions_service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MAGAZINE_SUBSCR_PRICING")
public class magazine_subscription_pricing {
	   @Id
	   @Column(name="M_NAME")
	    private String m_name;
	    
	   @Id
	    @Column(name="NOOFISSUES")
	    private int noOfIssues;
	    
	    @Column(name="RATE")
	    private double rate;
}
