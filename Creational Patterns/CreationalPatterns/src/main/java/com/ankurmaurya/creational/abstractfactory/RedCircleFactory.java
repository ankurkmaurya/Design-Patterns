package com.ankurmaurya.creational.abstractfactory;

import com.ankurmaurya.creational.abstractfactory.color.Color;
import com.ankurmaurya.creational.abstractfactory.color.Red;
import com.ankurmaurya.creational.abstractfactory.shape.Circle;
import com.ankurmaurya.creational.abstractfactory.shape.Shape;

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
