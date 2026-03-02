package com.sushma.practice.marketplace.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@GetMapping("/details")
	public ResponseEntity<Map<String,String>> getOrderDetails() {
		System.out.println("In the getOrderDetails method");
		Map<String,String> orderDetails = new HashMap<>();
		orderDetails.put("Product", "Coconut Oil");
		orderDetails.put("Brand", "Parachute");
		orderDetails.put("Quantity", "1");
		orderDetails.put("Price", "150.00");
		return ResponseEntity.status(HttpStatus.OK).body(orderDetails);
		
	}

}
