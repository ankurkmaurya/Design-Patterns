package com.ankurmaurya.behavioral.observer;

/**
 * 
 * <h3>Observer Design Pattern</h3>
 * <p>
 * It is useful when we are interested in the state of an Object and want to get
 * notified whenever there is any change. In the observer pattern, the Object
 * that watches the state of another Object is called <i>Observer</i>, and the
 * Object that is being watched is called <i>Subject</i>.
 * </p>
 * <p>
 * Define a one-to-many dependency between objects so that when one object
 * changes state, all its dependents are notified and updated automatically. It
 * specifies communication between objects: observable and observers. An
 * observable is an object which notifies observers about the changes in its
 * state.<br>
 * <b>Observer lets receivers dynamically subscribe to and unsubscribe from
 * receiving requests.</b>
 * </p>
 * 
 * 
 * <h3>Structure :</h3>
 * <ol>
 * <li><b>Observable (Publisher) :</b> The object that has some interesting
 * state is often called subject, but since it’s also going to notify other
 * objects about the changes to its state, we’ll call it publisher.</li>
 * <li><b>Observers (Subscribers) :</b> All other objects that want to track
 * changes to the publisher’s state are called subscribers.</li>
 * </ol>
 * 
 * 
 * <p>
 * <h3>Point :</h3>
 * <li>Model-View-Controller (MVC) frameworks also use Observer pattern where
 * Model is the Subject and Views are observers that can register to get
 * notified of any change to the model.</li>
 * <li>Use the Observer pattern when changes to the state of one object may
 * require changing other objects, and the actual set of objects is unknown
 * beforehand or changes dynamically.</li>
 * <li>Use the pattern when some objects in your app must observe others, but
 * only for a limited time or in specific cases.</li>
 * 
 * <li><b>Pros : </b></li>
 * <ol>
 * <li>Open/Closed Principle. You can introduce new subscriber classes without
 * having to change the publisher’s code (and vice versa if there’s a publisher
 * interface).</li>
 * <li>You can establish relations between objects at runtime.</li>
 * </ol>
 * 
 * <li><b>Cons : </b></li>
 * <ol>
 * <li>Subscribers are notified in random order.</li>
 * </ol>
 * 
 * <li><b>The difference between Mediator and Observer is often elusive. In most
 * cases, you can implement either of these patterns, but sometimes you can
 * apply both simultaneously.</b></li>
 * <ol>
 * <li>The primary goal of Mediator is to eliminate mutual dependencies among a
 * set of system components. Instead, these components become dependent on a
 * single mediator object.</li>
 * <li>The goal of Observer is to establish dynamic one-way connections between
 * objects, where some objects act as subordinates of others.</li>
 * <li>There’s a popular implementation of the Mediator pattern that relies on
 * Observer. The mediator object plays the role of publisher, and the components
 * act as subscribers which subscribe to and unsubscribe from the mediator’s
 * events. When Mediator is implemented this way, it may look very similar to
 * Observer.</li>
 * <li></li>
 * </ol>
 * </p>
 * 
 *
 * 
 * @author Ankur Maurya
 * 
 */

public class Observer {

	public static void main(String[] args) {
		
		System.out.println("------ Observer Design Pattern Implementation ------");

		Editor editor = new Editor();
		editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
		editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

		try {
			editor.openFile("test.txt");
			editor.saveFile();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
