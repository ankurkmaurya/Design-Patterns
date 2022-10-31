package com.ankurmaurya.creational.abstractfactory.shape;

public class ShapeFactory {

	private ShapeFactory() {
	}

	public static Shape getShape(ShapeType shapeType) {
		Shape shape = null;
		switch (shapeType) {
		case CIRCLE:
			shape = new Circle();
			break;
		case SQUARE:
			shape = new Square();
			break;
		case RECTANGLE:
			shape = new Rectangle();
			break;
		}
		return shape;
	}
}
