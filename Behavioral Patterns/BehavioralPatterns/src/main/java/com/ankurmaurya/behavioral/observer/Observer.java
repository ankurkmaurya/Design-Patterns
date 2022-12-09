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
 * state.
 * </p>
 * 
 * 
 * <h3>Structure :</h3>
 * <ol>
 * <li><b>Observable (Publisher) :</b> The object that has some interesting state is
 * often called subject, but since it’s also going to notify other objects about
 * the changes to its state, we’ll call it publisher.</li>
 * <li><b>Observers (Subscribers) :</b> All other objects that want to track changes to
 * the publisher’s state are called subscribers.</li>
 * </ol>
 * 
 * 
 * <p>
 * <h3>Point :</h3>
 * <li>Model-View-Controller (MVC) frameworks also use Observer pattern where
 * Model is the Subject and Views are observers that can register to get
 * notified of any change to the model.</li>
 * <li></li>
 * <li></li>
 * <li></li>
 * </p>
 * 
 *
 * 
 * @author Ankur Maurya
 * 
 */

public class Observer {

	public static void main(String[] args) {

	}

}
