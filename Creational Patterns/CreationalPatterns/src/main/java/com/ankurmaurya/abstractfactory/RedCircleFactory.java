package com.ankurmaurya.abstractfactory;

import com.ankurmaurya.abstractfactory.color.Color;
import com.ankurmaurya.abstractfactory.color.Red;
import com.ankurmaurya.abstractfactory.shape.Circle;
import com.ankurmaurya.abstractfactory.shape.Shape;

public class RedCircleFactory extends ColorShapeFactory {

	@Override
	public Color createColor() {
		return new Red();
	}

	@Override
	public Shape createShape() {
		return new Circle();
	}

	
	
}
