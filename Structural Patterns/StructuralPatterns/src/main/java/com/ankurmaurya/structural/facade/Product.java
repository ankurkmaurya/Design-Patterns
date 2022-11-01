package com.ankurmaurya.structural.facade;

public class Product {
	private final int productId;
	private final String name;

	public Product(int productId, String name) {
		this.productId = productId;
		this.name = name;
	}

	public int getProductId() {
		return productId;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + "]";
	}
	
}
