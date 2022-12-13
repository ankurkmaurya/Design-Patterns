package com.ankurmaurya.behavioral.templatemethod;

public class StoreOrder extends OrderProcessTemplate {

	@Override
	public void doSelect() {
		System.out.println("Customer chooses the item from shelf.");
	}

	@Override
	public void doPayment() {
		System.out.println("Pay's at counter through Cash/POS");
	}

	@Override
	public void doDelivery() {
		System.out.println("Item delivered to in delivery counter.");
	}

}
