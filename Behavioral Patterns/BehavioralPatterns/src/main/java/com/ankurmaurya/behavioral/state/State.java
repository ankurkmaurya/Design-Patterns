package com.ankurmaurya.behavioral.state;

/**
 * 
 * <h3>State Design Pattern</h3>
 * <p>
 * State is a behavioral design pattern that lets an object alter its behavior
 * when its internal state changes. It appears as if the object changed its
 * class.
 * </p>
 * <p>
 * The main idea of State pattern is to allow the object for changing its
 * behavior without changing its class. Also, by implementing it, the code
 * should remain cleaner without many if/else statements.
 * </p>
 * 
 * 
 * <h3>Structure :</h3>
 * <ol>
 * <li><b>Context :</b> Defines an interface for client to interact. It maintains
 * references to concrete state object which may be used to define current state
 * of object.</li>
 * <li><b>State :</b> Defines interface for declaring what each concrete state
 * should do.</li>
 * <li><b>Concrete-State :</b> Provides implementation for methods defined in
 * State.</li>
 * </ol>
 * 
 * 
 * <p>
 * <h3>Point :</h3>
 * <li>Use the State pattern when you have an object that behaves differently
 * depending on its current state, the number of states is enormous, and the
 * state-specific code changes frequently.</li>
 * <li>Use the pattern when you have a class polluted with massive conditionals
 * that alter how the class behaves according to the current values of the
 * class’s fields.</li>
 * <li>Use State when you have a lot of duplicate code across similar states and
 * transitions of a condition-based state machine.</li>
 * <li>State can be considered as an extension of Strategy.<br>
 * Both patterns are based on composition: they change the behavior of the
 * context by delegating some work to helper objects.<br>
 * Strategy makes these objects completely independent and unaware of each
 * other.<br>
 * However, State doesn’t restrict dependencies between concrete states, letting
 * them alter the state of the context at will.</li>
 * <li>In state pattern, the behavior might change completely, based on actual
 * state.</li>
 * <li><b>State Pattern vs Strategy Pattern :</b> The structures of both
 * patterns are similar, but the intents are different. The strategy pattern
 * provides a better alternative to sub-classing, while in state pattern –
 * behavior is encapsulated in separate classes.</li>
 * </ol>
 * </p>
 * 
 *
 * @author Ankur Maurya
 * 
 * 
 */

public class State {

	public static void main(String[] args) {
		System.out.println("------ State Design Pattern Implementation ------");

		DeliveryContext ctx = new DeliveryContext(null, "Action Slipper");
		ctx.update(); //Acknowledged
		ctx.update(); //Shipped
		ctx.update(); //In Transition
		ctx.update(); //Out for Delivery
		ctx.update(); //Delivered
		
	}

}
