package com.ankurmaurya.abstractfactory;

import com.ankurmaurya.abstractfactory.color.Color;
import com.ankurmaurya.abstractfactory.color.Green;
import com.ankurmaurya.abstractfactory.shape.Circle;
import com.ankurmaurya.abstractfactory.shape.Shape;

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
