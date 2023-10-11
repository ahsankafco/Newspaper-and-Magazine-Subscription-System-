package com.subscription.subscriptions_service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="NEWS_DAILY_SUBSCR_PRICING")
public class news_daily_subscription_pricing {
	   
	   @Id
	   @Column(name="N_NAME")
	    private String n_name;
	     
	   @Id
	    @Column(name="PERIOD_TYPE")
	    private String period_type;
	    
	    @Column(name="RATE")
	    private double rate;
}
