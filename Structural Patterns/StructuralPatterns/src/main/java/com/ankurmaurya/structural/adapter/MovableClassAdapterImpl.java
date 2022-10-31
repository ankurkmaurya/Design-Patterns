package com.ankurmaurya.structural.adapter;

//Class Adapter Implementation
public class MovableClassAdapterImpl extends BugattiVeyron implements MovableAdapter {

	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(super.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}

}
