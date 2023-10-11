package com.subscription.subscriptions_service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class customer {
	
	@Id
    @GeneratedValue
    @Column(name="ID_NO")
    private Long id;
     
    @Column(name="NAME")
    private String name;
     
    @Column(name="ADDRESS")
    private String address;
    
	    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}	     
	 
}
