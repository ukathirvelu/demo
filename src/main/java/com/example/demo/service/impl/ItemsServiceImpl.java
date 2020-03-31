package com.example.demo.service.impl;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Items;
import com.example.demo.service.ItemsService;

@Service
public class ItemsServiceImpl implements ItemsService {

	
	@Override
	public List<Items> getAll() {
		List<Items> items = Arrays.asList(new Items(new BigInteger("1"), "iPhone XS", "iPhone xs description", "sku1223"), 
				new Items(new BigInteger("2"), "iPhone X", "iPhone x description", "sku1224"),
				new Items(new BigInteger("3"), "Google Pixel", "Google pixel description", "sku1225"));
		return items;
	}

}
