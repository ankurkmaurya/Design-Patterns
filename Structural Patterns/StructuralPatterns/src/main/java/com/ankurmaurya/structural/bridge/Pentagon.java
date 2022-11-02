package com.ankurmaurya.structural.bridge;

public class Pentagon extends Shape {

	public Pentagon(Color c) {
		super(c);
	}

	@Override
	public void draw() {
		System.out.print("Pentagon drawn -> ");
		color.applyColor();
	}

}
