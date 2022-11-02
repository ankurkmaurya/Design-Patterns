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
 * <p>
 * <h3><font color="green">Problem -</font></h3>
 * <p>
 * Using the Composite pattern makes sense only when the core model of your app
 * can be represented as a tree.<br>
 * For example, imagine that you have two types of objects: <i>Products</i> and
 * <i>Boxes</i>. A <i>Box</i> can contain several <i>Products</i> as well as a
 * number of smaller <i>Boxes</i>. These little <i>Boxes</i> can also hold some
 * <i>Products</i> or even smaller <i>Boxes</i>, and so on.<br>
 * Say you decide to create an ordering system that uses these classes. Orders
 * could contain simple products without any wrapping, as well as boxes stuffed
 * with products...and other boxes. How would you determine the total price of
 * such an order?<br>
 * You could try the direct approach: unwrap all the boxes, go over all the
 * products and then calculate the total. That would be doable in the real
 * world; but in a program, it’s not as simple as running a loop. You have to
 * know the classes of <i>Products</i> and <i>Boxes</i> you’re going through,
 * the nesting level of the boxes and other nasty details beforehand. All of
 * this makes the direct approach either too awkward or even impossible.
 * </p>
 * 
 * <p>
 * <h3><font color="green">Solution -</font></h3>
 * <p>
 * The Composite pattern suggests that you work with <i>Products</i> and
 * <i>Boxes</i> through a common interface which declares a method for
 * calculating the total price.<br>
 * How would this method work? For a product, it’d simply return the product’s
 * price. For a box, it’d go over each item the box contains, ask its price and
 * then return a total for this box. If one of these items were a smaller box,
 * that box would also start going over its contents and so on, until the prices
 * of all inner components were calculated. A box could even add some extra cost
 * to the final price, such as packaging cost.
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
