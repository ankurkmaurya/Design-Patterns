package com.ankurmaurya.behavioral.visitor;

/**
 * 
 * <h3>Visitor Design Pattern</h3>
 * <p>
 * It allows adding new behaviors to existing class hierarchy without altering
 * any existing code.
 * </p>
 * <p>
 * It lets you separate algorithms from the objects on which they operate.<br>
 * The purpose of a Visitor pattern is to define a new operation without
 * introducing the modifications to an existing object structure.
 * </p>
 * 
 * 
 * <h3>Structure :</h3>
 * <ol>
 * <li>The <b>Visitor</b> interface declares a set of visiting methods that can
 * take concrete elements of an object structure as arguments. These methods may
 * have the same names if the program is written in a language that supports
 * overloading, but the type of their parameters must be different.</li>
 * <li>Each <b>Concrete Visitor</b> implements several versions of the same
 * behaviors, tailored for different concrete element classes.</li>
 * <li>The <b>Element</b> interface declares a method for “accepting” visitors.
 * This method should have one parameter declared with the type of the visitor
 * interface.</li>
 * <li>Each <b>Concrete Element</b> must implement the acceptance method. The
 * purpose of this method is to redirect the call to the proper visitor’s method
 * corresponding to the current element class. Be aware that even if a base
 * element class implements this method, all subclasses must still override this
 * method in their own classes and call the appropriate method on the visitor
 * object.</li>
 * <li>The <b>Client</b> usually represents a collection or some other complex
 * object (for example, a Composite tree). Usually, clients aren’t aware of all
 * the concrete element classes because they work with objects from that
 * collection via some abstract interface.</li>
 * </ol>
 * 
 * 
 * <p>
 * <h3>Point :</h3>
 * <li>Use the Visitor when you need to perform an operation on all elements of
 * a complex object structure (for example, an object tree).</li>
 * <li>Use the Visitor to clean up the business logic of auxiliary
 * behaviors.</li>
 * <li>Use the pattern when a behavior makes sense only in some classes of a
 * class hierarchy, but not in others.</li>
 * <li>You can treat Visitor as a powerful version of the Command pattern. Its
 * objects can execute operations over various objects of different
 * classes.</li>
 * <li>You can use Visitor to execute an operation over an entire Composite
 * tree.</li>
 * <li>You can use Visitor along with Iterator to traverse a complex data
 * structure and execute some operation over its elements, even if they all have
 * different classes.</li>
 * </ol>
 * </p>
 * 
 * 
 * @author Ankur Maurya
 * 
 * 
 */

public class Visitor {

	public static void main(String[] args) {
		
		System.out.println("------ Visitor Design Pattern Implementation ------");

		Dot dot = new Dot(1, 10, 55);
		Circle circle = new Circle(2, 23, 15, 10);
		Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

		CompoundShape compoundShape = new CompoundShape(4);
		compoundShape.add(dot);
		compoundShape.add(circle);
		compoundShape.add(rectangle);

		CompoundShape cElement = new CompoundShape(5);
		cElement.add(dot);
		compoundShape.add(cElement);

		export(circle);
		export(circle, compoundShape);
	}

	private static void export(Shape... shapes) {
		XMLExportVisitor exportVisitor = new XMLExportVisitor();
		System.out.println(exportVisitor.export(shapes));
	}

}
