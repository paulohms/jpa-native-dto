package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.ItemSummary;
import com.example.repository.ItemRepository;

@RestController
public class ItemController {

	@Autowired
	private ItemRepository itemRepository;

	@GetMapping("/item/{id}")
	public ItemSummary getItemSummary(@PathVariable("id") String id) {
		return itemRepository.getItemSummary(id);
	}

}
