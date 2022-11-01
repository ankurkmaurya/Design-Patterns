package com.ankurmaurya.structural.facade;

/**
 * 
 * <h1>Facade Design Pattern</h1>
 * <p>
 * Facade design pattern is used to help client applications to easily interact
 * with the system. Provide a unified interface to a set of interfaces in a
 * subsystem. Facade Pattern defines a higher-level interface that makes the
 * subsystem easier to use.
 * </p>
 * <p>
 * The facade pattern is appropriate when we have a complex system that we want
 * to expose to clients in a simplified way. Its purpose is to hide internal
 * complexity behind a single interface that appears simple from the outside.
 * The Facade Pattern makes a complex interface easier to use, using a Facade
 * class. The Facade Pattern provides a unified interface to a set of interface
 * in a subsystem. Facade defines a higher-level interface that makes the
 * subsystem easier to use.
 * </p>
 * 
 * 
 * <h3>Points :</h3>
 * <ul>
 * <li>Facade design pattern is more like a helper for client applications, it
 * doesn’t hide subsystem interfaces from the client. Whether to use Facade or
 * not is completely dependent on client code.</li>
 * <li>Facade design pattern can be applied at any point of development, usually
 * when the number of interfaces grow and system gets complex.</li>
 * <li>Subsystem interfaces are not aware of Facade and they shouldn’t have any
 * reference of the Facade interface.</li>
 * <li>Facade design pattern should be applied for similar kind of interfaces,
 * its purpose is to provide a single interface rather than multiple interfaces
 * that does the similar kind of jobs.</li>
 * <li>We can use Factory pattern with Facade to provide better interface to
 * client systems.</li>
 * <li>Facade defines a new interface, whereas Adapter uses an old interface.
 * Remember that Adapter makes two existing interfaces work together as opposed
 * to defining an entirely new one.</li>
 * <li>Whereas Flyweight shows how to make lots of little objects, Facade shows
 * how to make a single object represent an entire subsystem.</li>
 * <li>Facade objects are often Singletons because only one Facade object is
 * required.</li>
 * <li>Adapter and Facade are both wrappers; but they are different kinds of
 * wrappers. The intent of Facade is to produce a simpler interface, and the
 * intent of Adapter is to design to an existing interface. While Facade
 * routinely wraps multiple objects and Adapter wraps a single object; Facade
 * could front-end a single complex object and Adapter could wrap several legacy
 * objects.</li>
 * <li>The Facade do not encapsulate the subsystem classes or interfaces; it
 * just provides a simplified interface to their functionality. A client can
 * access these classes directly. It still exposes the full functionality of the
 * system for the clients who may need it.</li>
 * </ul>
 * 
 * 
 * @author Ankur Maurya
 * 
 */

public class Facade {

	public static void main(String[] args) {
		
		System.out.println("--- Facade Pattern ---");
		OrderServiceFacade osf = new OrderServiceFacadeImpl();
		
		Product p1 = new Product(1, "Cell Phone"); 
		Product p2 = new Product(2, "Washing Machine"); 
		
		System.out.println();
		osf.placeOrder(p1);
		
		System.out.println();
		osf.placeOrder(p2);
		
	}

}
