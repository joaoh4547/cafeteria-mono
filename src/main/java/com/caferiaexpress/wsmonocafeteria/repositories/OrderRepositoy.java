package com.caferiaexpress.wsmonocafeteria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caferiaexpress.wsmonocafeteria.entities.Order;

@Repository
public interface OrderRepositoy extends JpaRepository<Order, Long> {
	
}
