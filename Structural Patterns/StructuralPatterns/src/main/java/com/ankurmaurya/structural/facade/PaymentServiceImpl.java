package com.ankurmaurya.structural.facade;

public class PaymentServiceImpl {
	public static boolean makePayment() {
		/* Connect with payment gateway for payment */
		System.out.println("Payment done successfully.");
		return true;
	}
}
