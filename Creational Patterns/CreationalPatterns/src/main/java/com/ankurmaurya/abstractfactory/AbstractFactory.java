package com.ankurmaurya.abstractfactory;

import com.ankurmaurya.abstractfactory.color.Color;
import com.ankurmaurya.abstractfactory.color.ColorType;
import com.ankurmaurya.abstractfactory.shape.Shape;
import com.ankurmaurya.abstractfactory.shape.ShapeType;

//@formatter:off
/**
 * 
 * <h1>Abstract Factory Design Pattern</h1>
 * 
 * <h3>Structure : </h3>
 * The Abstract Factory defines a Factory Method per product. 
 * Each Factory Method encapsulates the new operator and the concrete, platform-specific, product classes. 
 * Each "platform" is then modeled with a Factory derived class.
 * 
 * <h3>Points : </h3>
 * <ul>
 *  <li>Abstract Factory has the factory object producing objects of several classes.</li>
 *  <li>Abstract Factory classes are often implemented with Factory Methods, but they can also be implemented using Prototype.</li>
 *  <li>Abstract Factory can be used as an alternative to Facade to hide platform-specific classes.</li>
 *  <li>Builder focuses on constructing a complex object step by step.
 *      Abstract Factory emphasizes a family of product objects (either simple or complex). 
 *      Builder returns the product as a final step, but as far as the Abstract Factory is concerned, the product gets returned immediately.</li>
 *  <li>Often, designs start out using Factory Method (less complicated, more customizable, subclasses proliferate) 
 *      and evolve toward Abstract Factory, Prototype, or Builder (more flexible, more complex) as the designer 
 *      discovers where more flexibility is needed.</li>
 *  <li>Abstract Factory pattern is “factory of factories” and can be easily extended to accommodate more products.</li>
 *  <li>Abstract Factory pattern is robust and avoid conditional logic of Factory pattern.</li>
 * </ul>
 * 
 * 
 * <h3>Abstract Factory Design Pattern examples in JDK</h3>
 * <ul>
 *	<li>javax.xml.parsers.DocumentBuilderFactory#newInstance()</li>
 *	<li>javax.xml.transform.TransformerFactory#newInstance()</li>
 *	<li>javax.xml.xpath.XPathFactory#newInstance()</li>
 * </ul>
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
