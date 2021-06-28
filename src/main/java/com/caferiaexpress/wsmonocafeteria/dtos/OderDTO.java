package com.caferiaexpress.wsmonocafeteria.dtos;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class OderDTO {
	private List<ItemDTO> items;

	public OderDTO() {
	}

	public OderDTO(List<ItemDTO> items) {
		super();
		this.items = items;
	}

	public List<ItemDTO> getItems() {
		return items;
	}

	public void setItems(List<ItemDTO> itemDTOs) {
		this.items = itemDTOs;
	}
	
	
}
