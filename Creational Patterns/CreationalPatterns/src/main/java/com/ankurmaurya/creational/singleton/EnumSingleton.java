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
 * <li>As enums don’t have any constructor so it is not possible for Reflection
 * to utilize it. Enums have their by-default constructor, we can’t invoke them
 * by ourself. JVM handles the creation and invocation of enum constructors
 * internally. As enums don’t give their constructor definition to the program,
 * it is not possible for us to access them by Reflection also. Hence,
 * reflection can’t break singleton property in case of enums.</li>
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
