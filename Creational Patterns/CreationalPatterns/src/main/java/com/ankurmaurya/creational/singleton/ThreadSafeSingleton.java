package com.ankurmaurya.creational.singleton;

/**
 * 
 * <p>
 * <h3>Thread Safe Singleton</h3>
 * <ul>
 * <li>The easier way to create a thread-safe singleton class is to make the
 * global access method synchronized, so that only one thread can execute this
 * method at a time.</li>
 * <li>It works fine and provides thread-safety but it reduces the performance
 * because of the cost associated with the synchronized method, although we need
 * it only for the first few threads who might create the separate
 * instances.</li>
 * <li><b>Double Checked Locking :</b> To avoid the above extra overhead every
 * time, <i>double checked locking</i> principle is used. In this approach, the
 * synchronized block is used inside the if condition with an additional check
 * to ensure that only one instance of a singleton class is created.</li>
 * </ul>
 * </p>
 * 
 * 
 * @author Ankur Maurya
 *
 */

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}

	// Double Checked Locking static method
	public static ThreadSafeSingleton getInstanceUsingDoubleCheckedLocking() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}

	public static void nullInstance() {
		instance = null;
	}

	// private constructor to avoid client applications to use constructor
	private ThreadSafeSingleton() {
	}

}
