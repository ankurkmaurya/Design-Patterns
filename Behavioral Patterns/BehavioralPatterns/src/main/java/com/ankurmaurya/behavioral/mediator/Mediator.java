package com.ankurmaurya.behavioral.mediator;

/**
 * 
 * <h3>Mediator Design Pattern</h3>
 * <p>
 * Mediator is a behavioral design pattern that lets you reduce chaotic
 * dependencies between objects. The pattern restricts direct communications
 * between the objects and forces them to collaborate only via a mediator
 * object. It is used to provide a centralized
 * communication medium between different objects in a system.
 * </p>
 * <p>
 * It allows loose coupling by encapsulating the way disparate sets of objects
 * interact and communicate with each other. Allows for the actions of each
 * object set to vary independently of one another.
 * </p>
 * 
 * 
 * <h3>Structure :</h3>
 * <ol>
 * <li><b>Mediator :</b> It defines the interface for communication between
 * colleague objects.</li>
 * <li><b>ConcreteMediator :</b> It implements the mediator interface and
 * coordinates communication between colleague objects.</li>
 * <li><b>Colleague :</b> It defines the interface for communication with other
 * colleagues.</li>
 * <li><b>ConcreteColleague :</b> It implements the colleague interface and
 * communicates with other colleagues through its mediator.</li>
 * </ol>
 * 
 * 
 * <p>
 * <h3>Point :</h3>
 * <li>The mediator object: encapsulates all interconnections, acts as the hub
 * of communication, is responsible for controlling and coordinating the
 * interactions of its clients, and promotes loose coupling by keeping objects
 * from referring to each other explicitly.</li>
 * <li>The Mediator pattern promotes a "many-to-many relationship network" to
 * "full object status". Modelling the inter-relationships with an object
 * enhances encapsulation, and allows the behavior of those inter-relationships
 * to be modified or extended through subclassing.</li>
 * <li>Chain of Responsibility, Command, Mediator, and Observer, address how you
 * can decouple senders and receivers, but with different trade-offs. Chain of
 * Responsibility passes a sender request along a chain of potential receivers.
 * Command normally specifies a sender-receiver connection with a subclass.
 * Mediator has senders and receivers reference each other indirectly. Observer
 * defines a very decoupled interface that allows for multiple receivers to be
 * configured at run-time.</li>
 * <li>Mediator and Observer are competing patterns. The difference between them
 * is that Observer distributes communication by introducing "observer" and
 * "subject" objects, whereas a Mediator object encapsulates the communication
 * between other objects. We've found it easier to make reusable Observers and
 * Subjects than to make reusable Mediators.</li>
 * <li>Mediator is similar to Facade in that it abstracts functionality of
 * existing classes. Mediator abstracts/centralizes arbitrary communication
 * between colleague objects, it routinely "adds value", and it is
 * known/referenced by the colleague objects (i.e. it defines a multidirectional
 * protocol). In contrast, Facade defines a simpler interface to a subsystem, it
 * doesn't add new functionality, and it is not known by the subsystem classes
 * (i.e. it defines a unidirectional protocol where it makes requests of the
 * subsystem classes but not vice versa).</li>
 * <li>Use the Mediator pattern when it’s hard to change some of the classes because they are tightly coupled to a bunch of other classes.</li>
 * <li>Use the pattern when you can’t reuse a component in a different program because it’s too dependent on other components.</li>
 * <li>Use the Mediator when you find yourself creating tons of component subclasses just to reuse some basic behavior in various contexts.</li>
 * <li>Disadvantage is over the time a mediator can evolve into a God Object.</li>
 * </p>
 * 
 * 
 * 
 * 
 * @author Ankur Maurya
 * 
 */

public class Mediator {

	public static void main(String[] args) {

		System.out.println("------ Mediator Design Pattern Implementation ------");
		
		ChatDistributor groupDistributor = new ChatDistributorImpl();
		User user1 = new UserImpl(groupDistributor, "Mayur");
		User user2 = new UserImpl(groupDistributor, "Mahendra");
		User user3 = new UserImpl(groupDistributor, "Rahul");
		User user4 = new UserImpl(groupDistributor, "Amol");
		User user5 = new UserImpl(groupDistributor, "Vishal");
		User user6 = new UserImpl(groupDistributor, "Amey");
		User user7 = new UserImpl(groupDistributor, "Ankur");
		groupDistributor.addUser(user1);
		groupDistributor.addUser(user2);
		groupDistributor.addUser(user3);
		groupDistributor.addUser(user4);
		//groupDistributor.addUser(user5);
		groupDistributor.addUser(user6);
		groupDistributor.addUser(user7);
		
		user7.send("Hi All");
		System.out.println();
		user1.send("I am going to our College today.");
		System.out.println();
		user5.send("We have a new family member (Car).");
		
		
		
	}

}
