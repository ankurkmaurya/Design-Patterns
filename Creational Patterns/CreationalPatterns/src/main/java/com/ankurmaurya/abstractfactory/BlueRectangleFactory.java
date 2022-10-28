package com.ankurmaurya.abstractfactory;

import com.ankurmaurya.abstractfactory.color.Blue;
import com.ankurmaurya.abstractfactory.color.Color;
import com.ankurmaurya.abstractfactory.shape.Rectangle;
import com.ankurmaurya.abstractfactory.shape.Shape;

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
