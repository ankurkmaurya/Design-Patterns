package com.ankurmaurya.behavioral.templatemethod;

/**
 * 
 * <h3>Template Method Design Pattern</h3>
 * <p>
 * It defines the skeleton of an algorithm in the superclass but lets subclasses
 * override specific steps of the algorithm without changing its structure.
 * </p>
 * <p>
 * It allows you to defines a skeleton of an algorithm in a base class and let
 * subclasses override the steps without changing the overall algorithm’s
 * structure.
 * </p>
 * <p>
 * Template Method design pattern is to define an algorithm as a skeleton of
 * operations and leave the details to be implemented by the child classes. The
 * overall structure and sequence of the algorithm are preserved by the parent
 * class.
 * </p>
 * 
 * 
 * <h3>Structure :</h3>
 * <ol>
 * <li>The <b>Abstract Class</b> declares methods that act as steps of an
 * algorithm, as well as the actual template method which calls these methods in
 * a specific order. The steps may either be declared abstract or have some
 * default implementation.</li>
 * <li>The <b>Concrete Classes</b> can override all of the steps, but not the
 * template method itself.</li>
 * </ol>
 * 
 * 
 * <p>
 * <h3>Point :</h3>
 * <li>Use the Template Method pattern when you want to let clients extend only
 * particular steps of an algorithm, but not the whole algorithm or its
 * structure.</li>
 * <li>Use the pattern when you have several classes that contain almost
 * identical algorithms with some minor differences. As a result, you might need
 * to modify all classes when the algorithm changes.</li>
 * <li>Factory Method is a specialization of Template Method. At the same time,
 * a Factory Method may serve as a step in a large Template Method.</li>
 * <li>Template Method is based on inheritance: it lets you alter parts of an
 * algorithm by extending those parts in subclasses. Strategy is based on
 * composition: you can alter parts of the object’s behavior by supplying it
 * with different strategies that correspond to that behavior. Template Method
 * works at the class level, so it’s static. Strategy works on the object level,
 * letting you switch behaviors at runtime.</li>
 * </ol>
 * </p>
 * 
 * 
 * @author Ankur Maurya
 * 
 * 
 */

public class TemplateMethod {

	public static void main(String[] args) {
		System.out.println("------ Template Method Design Pattern Implementation ------");

		System.out.println("1. Internet Order");
		OrderProcessTemplate netOrder = new InternetOrder();
		netOrder.processOrder(false);
		System.out.println();
		
		System.out.println("2. Store Order");
		OrderProcessTemplate storeOrder = new StoreOrder();
		storeOrder.processOrder(true);
		
	}

}
