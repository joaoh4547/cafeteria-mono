package com.caferiaexpress.wsmonocafeteria.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caferiaexpress.wsmonocafeteria.dtos.OderDTO;
import com.caferiaexpress.wsmonocafeteria.entities.Order;
import com.caferiaexpress.wsmonocafeteria.services.OrderService;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins= "*", allowedHeaders="*")
public class OrderResource {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping
	public ResponseEntity<Order> save(@RequestBody OderDTO order) {
		Order o =orderService.save(order);
		return ResponseEntity.status(HttpStatus.CREATED).body(o);
	}
}
	