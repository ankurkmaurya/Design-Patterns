package com.ankurmaurya.singleton;

/**
 * 
 * <p>
 * <h1>Singleton Design Pattern</h1>
 * <ul>
 * <li>Singleton pattern restricts the instantiation of a class and ensures that
 * only one instance of the class exists in the java virtual machine.</li>
 * <li>The singleton class must provide a global access point to get the
 * instance of the class.</li>
 * <li>Singleton pattern is used for logging, drivers objects, caching and
 * thread pool.</li>
 * <li>Singleton design pattern is also used in other design patterns like
 * Abstract Factory, Builder, Prototype, Facade etc.</li>
 * <li>Singleton design pattern is used in core java classes also, for example
 * java.lang.Runtime, java.awt.Desktop.</li>
 * </ul>
 * </p>
 * 
 * 
 * <p>
 * <h3>Structure :</h3>
 * <ol>
 * <li>Make the class of the single instance responsible for access and
 * "initialization on first use".</li>
 * <li>The single instance is a private static attribute.</li>
 * <li>The accessor function is a public static method.</li>
 * </ol>
 * </p>
 * 
 * 
 * <p>
 * <h3>Implementation :</h3>
 * <ol>
 * <li>Private constructor to restrict instantiation of the class from other
 * classes.</li>
 * <li>Private static variable of the same class that is the only instance of
 * the class.</li>
 * <li>Public static method that returns the instance of the class, this is the
 * global access point for outer world to get the instance of the singleton
 * class.</li>
 * </ol>
 * </p>
 * 
 * 
 * <p>
 * <h3>Different approaches of Singleton pattern implementation : </h3>
 * <ol>
 * <li>Eager initialization</li>
 * <li>Static block initialization</li>
 * <li>Lazy Initialization</li>
 * <li>Thread Safe Singleton</li>
 * <li>Bill Pugh Singleton Implementation</li>
 * <li>Using Reflection to destroy Singleton Pattern</li>
 * <li>Enum Singleton</li>
 * <li>Serialization and Singleton</li>
 * </ol>
 * </p>
 * 
 * 
 * @author Ankur Maurya
 * 
 */

public class Singleton {

	public static void main(String[] args) {

	}

}
