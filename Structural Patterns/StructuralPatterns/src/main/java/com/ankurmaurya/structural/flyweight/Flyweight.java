package com.ankurmaurya.structural.flyweight;

/**
 * 
 * <h1>Flyweight Design Pattern</h1>
 * <p>
 * Flyweight design pattern is used when we need to create a lot of Objects of a
 * class. Since every object consumes memory space that can be crucial for low
 * memory devices, such as mobile devices or embedded systems, flyweight design
 * pattern can be applied to reduce the load on memory by sharing objects.
 * </p>
 * <p>
 * The flyweight pattern is based on a factory which recycles created objects by
 * storing them after creation. Each time an object is requested, the factory
 * looks up the object in order to check if it's already been created. If it
 * has, the existing object is returned – otherwise, a new one is created,
 * stored and then returned.
 * </p>
 * <p>
 * <b>Note : </b>
 * <ul>
 * <li>It's very important that the flyweight objects are immutable: any
 * operation on the state must be performed by the factory.</li>
 * <li>Flyweight is an 'object normalization technique' in which common
 * properties are factored out into shared flyweight objects.</li>
 * </ul>
 * </p>
 * <p>
 * <b>Before we apply flyweight design pattern, we need to consider following
 * factors:</b>
 * <ol>
 * <li>The number of Objects to be created by application should be huge.</li>
 * <li>The object creation is heavy on memory and it can be time consuming
 * too.</li>
 * <li>The object properties can be divided into intrinsic and extrinsic
 * properties, extrinsic properties of an Object should be defined by the client
 * program.</li>
 * </ol>
 * </p>
 * 
 * 
 * <h3>Structure :</h3>
 * <ul>
 * <li>The flyweight object's state is made up of an invariant component shared
 * with other similar objects (Intrinsic) and a variant component which can be
 * manipulated by the client code (Extrinsic).
 * <ol>
 * <li><b>Intrinsic state</b> refers to the state that belongs to the flyweight
 * object. The intrinsic state is immutable. E.g.: color and height.</li>
 * <li><b>Extrinsic state</b> varies for each object and is stored outside the
 * object. The extrinsic state is mutable. E.g., position</li>
 * </ol>
 * </li>
 * <li>To apply flyweight pattern, we need to divide Object property into
 * Intrinsic and Extrinsic properties.</li>
 * <li>Intrinsic properties make the Object unique whereas extrinsic properties
 * are set by client code and used to perform different operations.</li>
 * <li>Flyweights are stored in a Factory's repository.</li>
 * <li>The client restrains from creating Flyweights directly, and requests them
 * from the Factory.</li>
 * <li>Each Flyweight cannot stand on its own. Any attributes that would make
 * sharing impossible must be supplied by the client whenever a request is made
 * of the Flyweight.</li>
 * <li>The flyweight design pattern has core participants such as
 * <b>Flyweight</b>, <b>FlyweightFactory</b>, <b>Context</b>, and <b>Client</b>.
 * <ol>
 * <li><b>Flyweight</b> class contains the intrinsic states of the objects
 * shared across multiple objects. The intrinsic states are immutable. E.g. :
 * color and height</li>
 * <li><b>FlyweightFactory</b> class is responsible for returning the Flyweight
 * object. It caches the flyweight object the first time it is created and
 * returns it for all successive requests. E.g. : TreeFactory</li>
 * <li><b>Context</b> class is responsible for maintaining all the flyweight
 * objects with their extrinsic states.</li>
 * <li><b>Client</b> class is the main class that uses the Context class to
 * create and store the flyweight objects with their extrinsic states.</li>
 * </ol>
 * </li>
 * </ul>
 * 
 * 
 * <h3>Points :</h3>
 * <ul>
 * <li>Whereas Flyweight shows how to make lots of little objects, Facade shows
 * how to make a single object represent an entire subsystem.</li>
 * <li>Flyweight is often combined with Composite to implement shared leaf
 * nodes.</li>
 * <li>Terminal symbols within Interpreter's abstract syntax tree can be shared
 * with Flyweight.</li>
 * <li>Flyweight explains when and how State objects can be shared.</li>
 * <li>Flyweight pattern implementation is not useful when the number of
 * intrinsic properties of Object is huge, making implementation of Factory
 * class complex.</li>
 * <li><b>Data Compression - </b>The goal of the flyweight pattern is to reduce
 * memory usage by sharing as much data as possible, hence, it's a good basis
 * for lossless compression algorithms. In this case, each flyweight object acts
 * as a pointer with its extrinsic state being the context-dependent
 * information.</li>
 * <li><b>Data Caching - </b>The flyweight pattern is similar to the core
 * concept of a cache and can fit this purpose well. Of course, there are a few
 * key differences in complexity and implementation between this pattern and a
 * typical, general-purpose cache.</li>
 * </ul>
 * 
 * 
 * <h3>Flyweight Design Pattern Example in JDK :</h3>
 * <ul>
 * <li>All the wrapper classes <i>valueOf()</i> method uses cached objects
 * showing use of Flyweight design pattern.</li>
 * <li>The best example is <i>Java String</i> class <i>String Pool</i>
 * implementation.</li>
 * </ul>
 * 
 * 
 * @author Ankur Maurya
 * 
 */


public class Flyweight {

	public static void main(String[] args) {
		System.out.println("--- Flyweight Pattern ---");

		Pen yellowThickPen1 = PenFactory.getPen(BrushSize.THICK, "YELLOW"); // created new pen
		yellowThickPen1.draw("Hello World!");

		Pen blueThickPen = PenFactory.getPen(BrushSize.THICK, "BLUE"); // created new pen
		blueThickPen.draw("Hello World!");

		Pen blueThinPen = PenFactory.getPen(BrushSize.THIN, "BLUE"); // created new pen
		blueThinPen.draw("Hello World!");

		Pen yellowThickPen2 = PenFactory.getPen(BrushSize.THICK, "YELLOW"); // pen is shared
		yellowThickPen2.draw("Hello World!");

		Pen blueThinPen1 = PenFactory.getPen(BrushSize.THIN, "BLUE"); // pen is shared
		blueThinPen1.draw("Hello World!");

		System.out.println(yellowThickPen1.hashCode());
		System.out.println(yellowThickPen2.hashCode());
		System.out.println(blueThickPen.hashCode());
		System.out.println(blueThinPen.hashCode());
		System.out.println(blueThinPen1.hashCode());

	}

}
