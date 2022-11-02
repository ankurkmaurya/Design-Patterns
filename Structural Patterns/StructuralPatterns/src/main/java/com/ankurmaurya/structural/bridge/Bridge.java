package com.ankurmaurya.structural.bridge;

/**
 * 
 * <h1>Bridge Design Pattern</h1>
 * <p>
 * Bridge is a structural design pattern that lets you split a large class or a
 * set of closely related classes into two separate hierarchies
 * <i>Abstraction</i> and <i>Implementation</i> which can be developed
 * independently of each other.
 * </p>
 * <p>
 * Decouple an abstraction from its implementation so that the two can vary
 * independently. The implementation of bridge design pattern follows the notion
 * to prefer Composition over inheritance.
 * </p>
 * 
 * 
 * <p>
 * <h3><font color="green">Problem -</font></h3>
 * <p>
 * Say you have a geometric <i>Shape</i> class with a pair of subclasses:
 * <i>Circle</i> and <i>Square</i>. You want to extend this class hierarchy to
 * incorporate colors, so you plan to create <i>Red</i> and <i>Blue</i> shape
 * subclasses. However, since you already have two subclasses, you’ll need to
 * create four class combinations such as <i>BlueCircle</i> and
 * <i>RedSquare</i>.
 * </p>
 * <p>
 * Adding new shape types and colors to the hierarchy will grow it
 * exponentially. For example, to add a triangle shape you’d need to introduce
 * two subclasses, one for each color. And after that, adding a new color would
 * require creating three subclasses, one for each shape type. The further we
 * go, the worse it becomes.
 * </p>
 * </p>
 * 
 * <p>
 * <h3><font color="green">Solution -</font></h3>
 * <p>
 * This problem occurs because we’re trying to extend the shape classes in two
 * independent dimensions: by form and by color. That’s a very common issue with
 * class inheritance.
 * </p>
 * <p>
 * The Bridge pattern attempts to solve this problem by switching from
 * inheritance to the object composition. What this means is that you extract
 * one of the dimensions into a separate class hierarchy, so that the original
 * classes will reference an object of the new hierarchy, instead of having all
 * of its state and behaviors within one class.
 * </p>
 * <p>
 * Following this approach, we can extract the color-related code into its own
 * class with two subclasses: <i>Red</i> and <i>Blue</i>. The <i>Shape</i> class
 * then gets a reference field pointing to one of the color objects. Now the
 * shape can delegate any color-related work to the linked color object. That
 * reference will act as a bridge between the <i>Shape</i> and <i>Color</i>
 * classes. From now on, adding new colors won’t require changing the shape
 * hierarchy, and vice versa.
 * </p>
 * </p>
 * 
 * 
 * <h3>Points :</h3>
 * <ul>
 * <li>Bridge design pattern can be used when both abstraction and
 * implementation can have different hierarchies independently and we want to
 * hide the implementation from the client application.</li>
 * <li>The Client doesn't want to deal with platform-dependent details. The
 * Bridge pattern encapsulates this complexity behind an abstraction
 * "wrapper".</li>
 * <li>Adapter makes things work after they're designed; Bridge makes them work
 * before they are.</li>
 * <li>Bridge is designed up-front to let the abstraction and the implementation
 * vary independently. Adapter is retrofitted to make unrelated classes work
 * together.</li>
 * <li>If interface classes delegate the creation of their implementation
 * classes (instead of creating/coupling themselves directly), then the design
 * usually uses the Abstract Factory pattern to create the implementation
 * objects.</li>
 * <li><b>Use the Bridge pattern when you want to divide and organize a
 * monolithic class that has several variants of some functionality (for
 * example, if the class can work with various database servers).<br>
 * The Bridge pattern lets you split the monolithic class into several class
 * hierarchies. After this, you can change the classes in each hierarchy
 * independently of the classes in the others. This approach simplifies code
 * maintenance and minimizes the risk of breaking existing code.</b></li>
 * <li>Use the Bridge if you need to be able to switch implementations at
 * runtime.</li>
 * <li>The Bridge suggests that you extract a separate class hierarchy for each
 * of the dimensions. The original class delegates the related work to the
 * objects belonging to those hierarchies instead of doing everything on its
 * own.</li>
 * </ul>
 * 
 * 
 * @author Ankur Maurya
 * 
 */

public class Bridge {

	public static void main(String[] args) {

		System.out.println("--- Bridge Pattern ---");
		Shape tri = new Triangle(new RedColor());
		tri.draw();
		Shape pent = new Pentagon(new GreenColor());
		pent.draw();

	}

}
