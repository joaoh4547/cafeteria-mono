package com.caferiaexpress.wsmonocafeteria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caferiaexpress.wsmonocafeteria.entities.Item;

@Repository
public interface ItemsRepository extends JpaRepository<Item, Long>{

}
