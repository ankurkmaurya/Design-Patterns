package factorymethod;


import abstractfactory.shape.Shape;
import abstractfactory.shape.ShapeFactory;
import abstractfactory.shape.ShapeType;

//@formatter:off
/**
* 
* Factory Method Design Pattern
* 
* Structure : 
* The factory design pattern is used when we have a superclass with multiple sub-classes and based on input, 
* we need to return one of the sub-class.
* 
* Checklist : 
* -> If you have an inheritance hierarchy that exercises polymorphism, consider adding a polymorphic 
*    creation capability by defining a static factory method in the base class.
* -> Design the arguments to the factory method. What qualities or characteristics are necessary and 
*    sufficient to identify the correct derived class to instantiate?
* -> Consider designing an internal "object pool" that will allow objects to be reused instead of created from scratch.
* -> Consider making all constructors private or protected.
* 
* 
* Points : 
* -> This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.
* -> Factory Methods are usually called within Template Methods.
* -> Factory Method: creation through inheritance. Prototype: creation through delegation.
* -> The advantage of a Factory Method is that it can return the same instance multiple times, 
*    or can return a subclass rather than an object of that exact type.
* -> Super class in factory design pattern can be an interface, abstract class or a normal java class.
* -> Factory pattern provides abstraction between implementation and client classes through inheritance.
* -> Factory pattern removes the instantiation of actual implementation classes from client code. 
*    Factory pattern makes our code more robust, less coupled and easy to extend.
* 
* 
* Factory Method Design Pattern examples in JDK
*	- java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
*   - valueOf() method in wrapper classes like Boolean, Integer etc.
* 
* 
* 
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
