package com.ankurmaurya.structural.composite;

/**
 * 
 * <h1>Composite Design Pattern</h1>
 * <p>
 * The composite pattern is meant to allow treating individual objects and
 * compositions of objects, or “composites” in the same way. Composite design
 * pattern is used when we have to represent a part-whole hierarchy.
 * </p>
 * <p>
 * It can be viewed as a tree structure made up of types that inherit a base
 * type, and it can represent a single part or a whole hierarchy of objects.
 * </p>
 * 
 * <h3>Structure :</h3>
 * <p>
 * We can break the pattern down into
 * </p>
 * <ol>
 * <li><b>Component –</b> is the base interface for all the objects in the
 * composition. It should be either an interface or an abstract class with the
 * common methods to manage the child composites.</li>
 * <li><b>Leaf –</b> implements the default behavior of the base component. It
 * doesn't contain a reference to the other objects.</li>
 * <li><b>Composite –</b> has leaf elements. It implements the base component
 * methods and defines the child-related operations.</li>
 * <li><b>Client –</b> has access to the composition elements by using the base
 * component object.</li>
 * </ol>
 * 
 * 
 * <h3>Points :</h3>
 * <ul>
 * <li>Composite and Decorator have similar structure diagrams, reflecting the
 * fact that both rely on recursive composition to organize an open-ended number
 * of objects.</li>
 * <li>Flyweight is often combined with Composite to implement shared leaf
 * nodes.</li>
 * <li>The whole point of the Composite pattern is that the Composite can be
 * treated atomically, just like a leaf.</li>
 * <li>Being able to treat a heterogeneous collection of objects atomically (or
 * transparently) requires that the "child management" interface be defined at
 * the root of the Composite class hierarchy (the abstract Component class).
 * </li>
 * <li>Composite design pattern provides a design hierarchy, in which nodes with
 * children differ from nodes without children.You can think of the tree data
 * structure in this case.</li>
 * <li>Objects can be shared and re-used as all objects extend a common class,
 * thus reducing memory footprint of the application, reducing object creation
 * time and garbage collection time.</li>
 * </ul>
 * 
 * 
 * @author Ankur Maurya
 * 
 */

public class Composite {

	public static void main(String[] args) {

		System.out.println("---- Composite Pattern Implementation ----");
		Shape tri = new Triangle();
		Shape tri1 = new Triangle();
		Shape cir = new Circle();
		
		Drawing drawing = new Drawing();
		drawing.add(tri1);
		drawing.add(tri1);
		drawing.add(cir);
		drawing.draw("Red");
		
		drawing.clear();
		
		drawing.add(tri);
		drawing.add(cir);
		drawing.draw("Green");
		
	}

}
