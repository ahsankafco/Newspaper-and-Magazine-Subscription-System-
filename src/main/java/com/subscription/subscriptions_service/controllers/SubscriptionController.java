package com.subscription.subscriptions_service.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubscriptionController {
	
@GetMapping("/")
	public String home() {
	System.out.println("in home");
		return "home";
	}
}
