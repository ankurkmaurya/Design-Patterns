package com.ankurmaurya.creational.abstractfactory;

import com.ankurmaurya.creational.abstractfactory.color.Color;
import com.ankurmaurya.creational.abstractfactory.color.Green;
import com.ankurmaurya.creational.abstractfactory.shape.Circle;
import com.ankurmaurya.creational.abstractfactory.shape.Shape;

public class GreenCircleFactory extends ColorShapeFactory {

	@Override
	public Color createColor() {
		return new Green();
	}

	@Override
	public Shape createShape() {
		return new Circle();
	}

}
