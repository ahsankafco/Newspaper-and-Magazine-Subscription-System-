package com.subscription.subscriptions_service.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subscription.subscriptions_service.entity.customer;
import com.subscription.subscriptions_service.repositories.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
    CustomerRepository repository;
     
    public List<customer> getAllCustomers()
    {
        List<customer> customersList = repository.findAll();
         
        if(customersList.size() > 0) {
            return customersList;
        } else {
            return new ArrayList<customer>();
        }
    }
     
    public customer getCustomerById(Long id)
    {
        Optional<customer> customerDtl = repository.findById(id);
         
            return customerDtl.get();
       
    }
     
    public customer createOrUpdateCustomer(customer entity) 
    {
        Optional<customer> customerDtl = repository.findById(entity.getId());
         
        if(customerDtl.isPresent()) 
        {
            customer newEntity = customerDtl.get();
            newEntity.setAddress(entity.getAddress());
 
            newEntity = repository.save(newEntity);
             
            return newEntity;
        } else {
            entity = repository.save(entity);
             
            return entity;
        }
    } 
     
    public void deleteCustomerById(Long id)
    {
        Optional<customer> customerDtl = repository.findById(id);
         
        if(customerDtl.isPresent()) 
        {
            repository.deleteById(id);
        } 
    }

}
