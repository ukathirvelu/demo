package com.example.demo.model;

import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Items {
	BigInteger id;
	String itemName;
	String itemDescription;
	String itemSku;

	public Items() {
	}

	public Items(BigInteger id, String itemName, String itemDescription, String itemSku) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemSku = itemSku;
	}

}
