package com.subscription.subscriptions_service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.subscription.subscriptions_service.entity.customer;
import com.subscription.subscriptions_service.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
    CustomerService service;
 
    @GetMapping
    public ResponseEntity<List<customer>> getAllCustomers() {
        List<customer> list = service.getAllCustomers();
 
        return new ResponseEntity<List<customer>>(list, new HttpHeaders(), HttpStatus.OK);
    }
 
    @GetMapping("/{id}")
    public ResponseEntity<customer> getCustomerById(@PathVariable("id") Long id)  {
        customer entity = service.getCustomerById(id);
 
        return new ResponseEntity<customer>(entity, new HttpHeaders(), HttpStatus.OK);
    }
 
    @PostMapping
    public ResponseEntity<customer> createOrUpdateCustomer(customer customerEntity) {
         customer updated = service.createOrUpdateCustomer(customerEntity);
        return new ResponseEntity<customer>(updated, new HttpHeaders(), HttpStatus.OK);
    }
 
    @DeleteMapping("/{id}")
    public HttpStatus deleteCustomerById(@PathVariable("id") Long id)  {
        service.deleteCustomerById(id);
        return HttpStatus.FORBIDDEN;
    }
	

}
