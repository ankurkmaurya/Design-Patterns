package com.ankurmaurya.creational.singleton;

/**
 * 
 * <p>
 * <h3>Enum Singleton</h3>
 * <ul>
 * <li>Enum can be used to implement Singleton design pattern as Java ensures
 * that any enum value is instantiated only once in a Java program.</li>
 * <li>Since Java Enum values are globally accessible, so is the singleton.</li>
 * <li>The drawback is that the enum type is somewhat inflexible; for example,
 * it does not allow lazy initialization.</li>
 * </ul>
 * </p>
 * 
 * 
 * @author Ankur Maurya
 *
 */

public enum EnumSingleton {

	INSTANCE;

	private String something;

	public synchronized String getSomething() {
		return something;
	}
	
	public synchronized void setSomething(String some) {
		this.something = some;
	}

	public void doSomething() {
		System.out.println("Calling doSomething() - " + something);
	}

}
