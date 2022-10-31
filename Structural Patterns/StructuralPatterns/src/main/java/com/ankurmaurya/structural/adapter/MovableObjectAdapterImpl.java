package com.ankurmaurya.structural.adapter;

//Object Adapter Implementation
public class MovableObjectAdapterImpl implements MovableAdapter {

	private Movable luxuryCars;

	public MovableObjectAdapterImpl(Movable luxuryCars) {
		this.luxuryCars = luxuryCars;
	}

	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}

}
