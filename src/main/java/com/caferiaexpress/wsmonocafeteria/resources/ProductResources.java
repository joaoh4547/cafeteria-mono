package com.caferiaexpress.wsmonocafeteria.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caferiaexpress.wsmonocafeteria.entities.Product;
import com.caferiaexpress.wsmonocafeteria.services.ProductService;

@RestController
@RequestMapping("api/products")
@CrossOrigin(origins= "*", allowedHeaders="*")
public class ProductResources {
	
	@Autowired
	private ProductService productServices;
	
	@GetMapping
	public ResponseEntity<List<Product>> getProducts(){
		List<Product> products = productServices.getProducts();
		return ResponseEntity.ok().body(products);
	}
	
}
