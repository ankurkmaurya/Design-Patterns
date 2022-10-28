package com.ankurmaurya.factorymethod;


import com.ankurmaurya.abstractfactory.shape.Shape;
import com.ankurmaurya.abstractfactory.shape.ShapeFactory;
import com.ankurmaurya.abstractfactory.shape.ShapeType;

//@formatter:off
/**
* 
* <h1>Factory Method Design Pattern</h1>
* 
* <h3>Structure : </h3>
* The factory design pattern is used when we have a superclass with multiple sub-classes and based on input, 
* we need to return one of the sub-class.
* 
* <h3>Checklist : </h3>
* <ul>
*  <li>If you have an inheritance hierarchy that exercises polymorphism, consider adding a polymorphic 
*    creation capability by defining a static factory method in the base class.</li>
*  <li>Design the arguments to the factory method. What qualities or characteristics are necessary and 
*    sufficient to identify the correct derived class to instantiate?</li>
*  <li>Consider designing an internal "object pool" that will allow objects to be reused instead of created from scratch.</li>
*  <li>Consider making all constructors private or protected.</li>
* </ul>
* 
* <h3>Points : </h3>
* <ul>
*  <li>This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.</li>
*  <li>Factory Methods are usually called within Template Methods.</li>
*  <li>Factory Method: creation through inheritance. Prototype: creation through delegation.</li>
*  <li>The advantage of a Factory Method is that it can return the same instance multiple times, 
*       or can return a subclass rather than an object of that exact type.</li>
*  <li>Super class in factory design pattern can be an interface, abstract class or a normal java class.</li>
*  <li>Factory pattern provides abstraction between implementation and client classes through inheritance.</li>
*  <li>Factory pattern removes the instantiation of actual implementation classes from client code.</li>
*      Factory pattern makes our code more robust, less coupled and easy to extend.</li>
* </ul>
* 
* 
* <h3>Factory Method Design Pattern examples in JDK</h3>
* <ul>
*	<li>java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.</li>
*   <li>valueOf() method in wrapper classes like Boolean, Integer etc.</li>
* </ul>
* 
* @author Ankur Maurya
* 
* 
*/
//@formatter:on

public class FactoryMethod {

	public static void main(String[] args) {
		System.out.println("CIRCLE");
		Shape shape = ShapeFactory.getShape(ShapeType.CIRCLE);
		shape.drawShape();
		System.out.println("");
		
		System.out.println("RECTANGLE");
		shape = ShapeFactory.getShape(ShapeType.RECTANGLE);
		shape.drawShape();
		System.out.println("");
		
		System.out.println("SQUARE");
		shape = ShapeFactory.getShape(ShapeType.SQUARE);
		shape.drawShape();
		System.out.println("");
	}
	
	
}
