package com.ankurmaurya.structural.facade;

public class ShippingServiceImpl {
	public static void shipProduct(Product product) {
		/* Connect with external shipment service to ship product */
		System.out.println(product.getName() +" Shipped.");
	}
}
