package abstractfactory;

import abstractfactory.color.Color;
import abstractfactory.color.Red;
import abstractfactory.shape.Circle;
import abstractfactory.shape.Shape;

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
