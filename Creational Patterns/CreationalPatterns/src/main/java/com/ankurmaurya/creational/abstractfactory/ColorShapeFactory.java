package com.ankurmaurya.creational.abstractfactory;

import com.ankurmaurya.creational.abstractfactory.color.Color;
import com.ankurmaurya.creational.abstractfactory.color.ColorType;
import com.ankurmaurya.creational.abstractfactory.shape.Shape;
import com.ankurmaurya.creational.abstractfactory.shape.ShapeType;

public abstract class ColorShapeFactory  {

    public static ColorShapeFactory getFactory(ColorType colorType, ShapeType shapeType) {
    	ColorShapeFactory colorShapeFactory = null;
    	if(colorType.equals(ColorType.RED) && shapeType.equals(ShapeType.CIRCLE)) {
    		colorShapeFactory = new RedCircleFactory();
    	} else if(colorType.equals(ColorType.GREEN) && shapeType.equals(ShapeType.CIRCLE)) {
    		colorShapeFactory = new GreenCircleFactory();
    	} else if(colorType.equals(ColorType.BLUE) && shapeType.equals(ShapeType.RECTANGLE)) {
    		colorShapeFactory = new BlueRectangleFactory();
    	}
    	return colorShapeFactory;
    }
	
	
	public abstract Color createColor();
	public abstract Shape createShape();

}
