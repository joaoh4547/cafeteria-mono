package com.caferiaexpress.wsmonocafeteria.dtos;

import org.springframework.stereotype.Component;

@Component
public class ItemDTO {
	private Integer productId;
	private Integer quantity;
	
	public ItemDTO() {
		
	}

	public ItemDTO(Integer productId, Integer quantity) {
		this.productId = productId;
		this.quantity = quantity;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	
}
