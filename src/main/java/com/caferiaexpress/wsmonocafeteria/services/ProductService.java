package com.caferiaexpress.wsmonocafeteria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caferiaexpress.wsmonocafeteria.entities.Product;
import com.caferiaexpress.wsmonocafeteria.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getProducts() {
		return productRepository.findAll();
	}
	
	public Product getById(Integer id) {
		return productRepository.findById(id).orElse(null);
	}
	
}
