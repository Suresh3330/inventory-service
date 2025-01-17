package com.programming.inventory_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programming.inventory_service.service.InventoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
	
	@Autowired
	private InventoryService inventoryService;

	@GetMapping("/{sku-code}")
	// @ResponseStatus(HttpStatus.OK)
	public boolean isInStock(@PathVariable("sku-code") String skuCode) {
		return inventoryService.isInStock(skuCode);

	}
}
