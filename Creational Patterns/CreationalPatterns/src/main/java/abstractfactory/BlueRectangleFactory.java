package abstractfactory;

import abstractfactory.color.Blue;
import abstractfactory.color.Color;
import abstractfactory.shape.Rectangle;
import abstractfactory.shape.Shape;

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
