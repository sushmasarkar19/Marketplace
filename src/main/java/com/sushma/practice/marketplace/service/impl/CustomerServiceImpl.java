package com.sushma.practice.marketplace.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushma.practice.marketplace.entity.CustomerEntity;
import com.sushma.practice.marketplace.repository.CustomerRepository;
import com.sushma.practice.marketplace.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public CustomerEntity createCustomer(CustomerEntity customerEntity) {
		
		 CustomerEntity savedcustomer=customerRepository.save(customerEntity);
		return savedcustomer;
	}

}
