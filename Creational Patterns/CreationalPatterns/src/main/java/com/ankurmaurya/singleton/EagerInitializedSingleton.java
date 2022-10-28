package com.ankurmaurya.singleton;

/**
 * 
 * <p>
 * <h3>Eager Initialized Singleton</h3>
 * In Eager Initialization, the instance of Singleton class is created at the
 * time of class loading, this is the easiest method to create a singleton class
 * but it has a drawback that instance is created even though client application
 * might not be using it.
 * </p>
 * 
 * @author Ankur Maurya
 *
 */

public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

	//private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {
	}

}
