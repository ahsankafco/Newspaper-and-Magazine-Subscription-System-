package com.subscription.subscriptions_service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MAGAZINE")
public class magazine {
	   
	public enum magazine_freq {
        WEEKLY,
        MONTHLY,
        QUARTERLY;
    }
	
	   @Id
	   @Column(name="NAME")
	    private String name;
	     
	   
	    @Column(name="M_FREQUENCY")
	    private magazine_freq m_frequency;
}
