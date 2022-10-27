package abstractfactory;

import abstractfactory.color.Color;
import abstractfactory.color.ColorType;
import abstractfactory.shape.Shape;
import abstractfactory.shape.ShapeType;

//@formatter:off
/**
 * 
 * Abstract Factory Design Pattern
 * 
 * Structure : 
 * The Abstract Factory defines a Factory Method per product. 
 * Each Factory Method encapsulates the new operator and the concrete, platform-specific, product classes. 
 * Each "platform" is then modeled with a Factory derived class.
 * 
 * Points : 
 * -> Abstract Factory has the factory object producing objects of several classes.
 * -> Abstract Factory classes are often implemented with Factory Methods, but they can also be implemented using Prototype.
 * -> Abstract Factory can be used as an alternative to Facade to hide platform-specific classes.
 * -> Builder focuses on constructing a complex object step by step. 
 *    Abstract Factory emphasizes a family of product objects (either simple or complex). 
 *    Builder returns the product as a final step, but as far as the Abstract Factory is concerned, the product gets returned immediately.
 * -> Often, designs start out using Factory Method (less complicated, more customizable, subclasses proliferate) 
 *    and evolve toward Abstract Factory, Prototype, or Builder (more flexible, more complex) as the designer 
 *    discovers where more flexibility is needed.
 * -> Abstract Factory pattern is “factory of factories” and can be easily extended to accommodate more products.
 * -> Abstract Factory pattern is robust and avoid conditional logic of Factory pattern.
 * 
 * Abstract Factory Design Pattern examples in JDK
 *	- javax.xml.parsers.DocumentBuilderFactory#newInstance()
 *	- javax.xml.transform.TransformerFactory#newInstance()
 *	- javax.xml.xpath.XPathFactory#newInstance()
 * 
 * 
 * @author Ankur Maurya
 * 
 */
//@formatter:on

public class AbstractFactory {

	
	public static void main(String[] args) {
		System.out.println("RED -> CIRCLE");
		ColorShapeFactory csF = ColorShapeFactory.getFactory(ColorType.RED, ShapeType.CIRCLE);
		Color c1 = csF.createColor();
		Shape s1 = csF.createShape();
		c1.fillColor();
		s1.drawShape();
		System.out.println("");
		
		System.out.println("GREEN -> CIRCLE");
		csF = ColorShapeFactory.getFactory(ColorType.GREEN, ShapeType.CIRCLE);
		Color c2 = csF.createColor();
		Shape s2 = csF.createShape();
		c2.fillColor();
		s2.drawShape();
		System.out.println("");
		
		System.out.println("BLUE -> RECTANGLE");
		csF = ColorShapeFactory.getFactory(ColorType.BLUE, ShapeType.RECTANGLE);
		Color c3 = csF.createColor();
		Shape s3 = csF.createShape();
		c3.fillColor();
		s3.drawShape();
		System.out.println("");
		
		System.out.println("BLUE -> SQUARE");
		csF = ColorShapeFactory.getFactory(ColorType.BLUE, ShapeType.SQUARE);
		Color c4 = csF.createColor();
		Shape s4 = csF.createShape();
		c4.fillColor();
		s4.drawShape();
		System.out.println("");
		
	}
	
	
	
	
	
	
}
