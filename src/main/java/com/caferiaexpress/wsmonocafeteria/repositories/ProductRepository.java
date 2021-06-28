package com.caferiaexpress.wsmonocafeteria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caferiaexpress.wsmonocafeteria.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
