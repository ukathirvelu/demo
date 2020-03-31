package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Items;
import com.example.demo.service.ItemsService;

@RestController
public class ItemsController {
	
	@Autowired
	ItemsService itemsService;
	
	@RequestMapping(value="/")
	public List<Items> getAllItems(){
		List<Items> items = itemsService.getAll();
		System.out.println(items);
		return items;
	}
}
