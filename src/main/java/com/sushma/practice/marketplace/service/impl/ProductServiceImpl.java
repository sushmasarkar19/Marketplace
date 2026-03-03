package com.sushma.practice.marketplace.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushma.practice.marketplace.entity.ProductEntity;
import com.sushma.practice.marketplace.repository.ProductRepository;
import com.sushma.practice.marketplace.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public ProductEntity createProduct(ProductEntity productEntity) {

		productEntity.setProductId(UUID.randomUUID());
		ProductEntity savedProduct = productRepository.save(productEntity);
		return savedProduct;
	}

}
