package com.ankurmaurya.creational.singleton;

/**
 * 
 * <p>
 * <h3>Static Block Initialized Singleton</h3>
 * Static block initialization implementation is similar to eager
 * initialization, except that instance of class is created in the static block
 * that provides option for exception handling.
 * </p>
 * 
 * @author Ankur Maurya
 *
 */

public class StaticBlockInitializedSingleton {

	private static StaticBlockInitializedSingleton instance;

	// static block initialization for exception handling
	static {
		try {
			instance = new StaticBlockInitializedSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockInitializedSingleton getInstance() {
		return instance;
	}

	//private constructor to avoid client applications to use constructor
	private StaticBlockInitializedSingleton() {
	}

}
