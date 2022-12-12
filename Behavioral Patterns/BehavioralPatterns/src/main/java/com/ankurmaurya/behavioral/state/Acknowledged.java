package com.ankurmaurya.behavioral.state;

public class Acknowledged implements PackageState {

	private static Acknowledged instance = new Acknowledged();

	private Acknowledged() {
	}

	public static Acknowledged instance() {
		return instance;
	}

	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Package(" + ctx.getPackageId() + ") is Acknowledged.");
		ctx.setCurrentState(Shipped.instance());
	}
}
