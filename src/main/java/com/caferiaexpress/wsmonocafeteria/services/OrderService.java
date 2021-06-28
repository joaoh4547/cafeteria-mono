package com.caferiaexpress.wsmonocafeteria.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caferiaexpress.wsmonocafeteria.dtos.ItemDTO;
import com.caferiaexpress.wsmonocafeteria.dtos.OderDTO;
import com.caferiaexpress.wsmonocafeteria.entities.Item;
import com.caferiaexpress.wsmonocafeteria.entities.Order;
import com.caferiaexpress.wsmonocafeteria.entities.Product;
import com.caferiaexpress.wsmonocafeteria.repositories.ItemsRepository;
import com.caferiaexpress.wsmonocafeteria.repositories.OrderRepositoy;
import com.caferiaexpress.wsmonocafeteria.repositories.ProductRepository;


@Service
public class OrderService {
	@Autowired
	private OrderRepositoy orderRepositoy;
	
	@Autowired
	private ItemsRepository itemsRepository;
	
	@Autowired 
	private ProductRepository productRepository;
	
	public Order save(OderDTO orderDTO) {
		
		
		List<Item> items = new ArrayList<>();
		
		for(ItemDTO i: orderDTO.getItems()) {
			Product p = productRepository.findById(i.getProductId()).orElse(null);
			Item it = new Item(null,p,i.getQuantity());
			items.add(it);
			itemsRepository.save(it);
		}
		Order order = new Order(null, items);
		orderRepositoy.save(order);
		return order;
	}
}
