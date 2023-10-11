package com.subscription.subscriptions_service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NEWSPAPER")
public class newspaper {
     
	 public enum newspaper_freq {
	        DAILY,
	        WEEKLY;
	    }
	 
    @Id
    @Column(name="NAME")
    private String name;
     
    @Column(name="N_FREQUENCY")
    private newspaper_freq n_frequency;

}
