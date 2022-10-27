package abstractfactory;

import abstractfactory.color.Color;
import abstractfactory.color.ColorType;
import abstractfactory.shape.Shape;
import abstractfactory.shape.ShapeType;

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
