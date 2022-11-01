package com.ankurmaurya.structural.facade;

public class InventoryServiceImpl {
	public static boolean isAvailable(Product product) {
		/* Check Warehouse database for product availability */
		System.out.println(product.getName() + " is Available.");
		return true;
	}
}
