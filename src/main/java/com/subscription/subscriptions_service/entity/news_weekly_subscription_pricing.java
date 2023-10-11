package com.subscription.subscriptions_service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NEWS_WEEKLY_SUBSCR_PRICING")
public class news_weekly_subscription_pricing {
	@Id
	   @Column(name="N_NAME")
	    private String n_name;
	@Id
	    @Column(name="NOOFMONTHS")
	    private int noOfMonths;
	    
	    @Column(name="RATE")
	    private double rate;
}
