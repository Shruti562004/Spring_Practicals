package com.rays.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Inventry {

	@Value("10")
	private int stock;

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int sold(int qty) {
		stock -= qty; // stock = stock - qty;
		return stock;
	}

}