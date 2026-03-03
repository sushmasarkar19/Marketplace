package com.sushma.practice.marketplace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sushma.practice.marketplace.entity.CustomerEntity;
import com.sushma.practice.marketplace.service.CustomerService;
import com.sushma.practice.marketplace.service.impl.CustomerServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/create")
	private ResponseEntity<String> createCustomer(@Valid @RequestBody CustomerEntity requestCustomerEntity) {

		CustomerEntity savedCustomerEntity = customerService.createCustomer(requestCustomerEntity);

		if (savedCustomerEntity != null)
			return ResponseEntity.status(HttpStatus.CREATED.value()).body("Customer created.");
		else
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body("Failed to create customer.");
	}

}
