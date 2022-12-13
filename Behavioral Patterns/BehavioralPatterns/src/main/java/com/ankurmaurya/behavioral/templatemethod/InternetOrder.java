package com.ankurmaurya.behavioral.templatemethod;

public class InternetOrder extends OrderProcessTemplate {

	@Override
	public void doSelect() {
		System.out.println("Item added to online shopping cart");
		System.out.println("Get gift wrap preference");
		System.out.println("Get delivery address.");
	}

	@Override
	public void doPayment() {
		System.out.println("Online Payment through Netbanking, Credit or Debit Card or UPI");
	}

	@Override
	public void doDelivery() {
		System.out.println("Ship the item through post to delivery address");

	}

}
