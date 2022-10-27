package abstractfactory;

import abstractfactory.color.Color;
import abstractfactory.color.Green;
import abstractfactory.shape.Circle;
import abstractfactory.shape.Shape;

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
