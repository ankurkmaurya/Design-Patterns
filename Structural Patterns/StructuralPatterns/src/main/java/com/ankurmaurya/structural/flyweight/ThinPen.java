package com.ankurmaurya.structural.flyweight;

public class ThinPen extends PenImpl {

	public ThinPen(String color) {
		super(color);
		// adding time delay
		try {
			System.out.println("THIN PEN creation delay.");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void draw(String content) {
		// Specific Implementation
		System.out.println("Drawing " + super.getBrushSize().name() +" " + content + " in Color " + super.getColor());
	}

}
