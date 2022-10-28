package com.ankurmaurya.singleton;

/**
 * 
 * <p>
 * <h3>Lazy Initialized Singleton</h3>
 * <ul>
 * <li>Lazy initialization method to implement Singleton pattern creates the
 * instance in the global access method.</li>
 * <li>It works fine in case of the single-threaded environment but when it
 * comes to multithreaded systems, it can cause issues if multiple threads are
 * inside the if condition at the same time. It will destroy the singleton
 * pattern and both threads will get the different instances of the singleton
 * class.</li>
 * </ul>
 * </p>
 * 
 * @author Ankur Maurya
 *
 */

public class LazyInitializedSingleton {

	private static LazyInitializedSingleton instance;

	public static LazyInitializedSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}
	
	public static void nullInstance() {
		instance = null;
	}
	
	//private constructor to avoid client applications to use constructor
	private LazyInitializedSingleton() {
	}
	

}
