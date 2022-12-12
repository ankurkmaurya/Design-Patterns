package com.ankurmaurya.behavioral.state;

public class Shipped implements PackageState {

	private static Shipped instance = new Shipped();

	private Shipped() {
	}

	public static Shipped instance() {
		return instance;
	}

	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Package(" + ctx.getPackageId() + ") is Shipped.");
		ctx.setCurrentState(InTransition.instance());
	}

}
