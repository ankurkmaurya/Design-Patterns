package com.ankurmaurya.structural.bridge;

public class Triangle extends Shape {

	public Triangle(Color c) {
		super(c);
	}

	@Override
	public void draw() {
		System.out.print("Triangle drawn -> ");
		color.applyColor();
	}

}
