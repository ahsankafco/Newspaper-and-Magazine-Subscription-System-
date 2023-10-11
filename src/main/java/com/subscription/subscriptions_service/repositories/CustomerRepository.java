package com.subscription.subscriptions_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subscription.subscriptions_service.entity.customer;

@Repository
public interface CustomerRepository extends JpaRepository<customer, Long>{
	
}
