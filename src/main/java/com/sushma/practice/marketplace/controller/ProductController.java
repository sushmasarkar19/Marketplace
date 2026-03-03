package com.sushma.practice.marketplace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sushma.practice.marketplace.entity.ProductEntity;
import com.sushma.practice.marketplace.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/marketplace/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@PostMapping("/create")
	private ResponseEntity<String> createProduct(@Valid @RequestBody ProductEntity requestEntity){
		 ProductEntity savedProductEntity = productService.createProduct(requestEntity);
		 
		 if (savedProductEntity.getProductId() != null)
			 return ResponseEntity.status(HttpStatus.CREATED.value()).body("Product added.");
		 else	
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body("Failed to add product");
	}
	
}
