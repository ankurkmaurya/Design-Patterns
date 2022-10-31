package com.ankurmaurya.creational.abstractfactory;

import com.ankurmaurya.creational.abstractfactory.color.Blue;
import com.ankurmaurya.creational.abstractfactory.color.Color;
import com.ankurmaurya.creational.abstractfactory.shape.Rectangle;
import com.ankurmaurya.creational.abstractfactory.shape.Shape;

public class BlueRectangleFactory extends ColorShapeFactory  {

	@Override
	public Color createColor() {
		return new Blue();
	}

	@Override
	public Shape createShape() {
		return new Rectangle();
	}

}
