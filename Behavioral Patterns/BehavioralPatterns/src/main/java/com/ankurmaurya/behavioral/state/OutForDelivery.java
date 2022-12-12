package com.ankurmaurya.behavioral.state;

public class OutForDelivery implements PackageState {
	private static OutForDelivery instance = new OutForDelivery();

	private OutForDelivery() {
	}

	public static OutForDelivery instance() {
		return instance;
	}

	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Package(" + ctx.getPackageId() + ") is Out for Delivery.");
		ctx.setCurrentState(Delivered.instance());
	}
}
