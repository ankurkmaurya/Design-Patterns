package com.ankurmaurya.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
 * <li>Singleton design pattern is used in core java classes, for example
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
 * <h3>Different approaches of Singleton pattern implementation :</h3>
 * <ol>
 * <li>Eager Initialization</li>
 * <li>Static Block Initialization</li>
 * <li>Lazy Initialization</li>
 * <li>Thread Safe Singleton</li>
 * <li>Bill Pugh Singleton Implementation</li>
 * <li>Using Reflection to destroy Singleton Pattern</li>
 * <li>Enum Singleton</li>
 * <li>Serialization and Cloning Singleton</li>
 * </ol>
 * </p>
 * 
 * 
 * @see com.ankurmaurya.creational.singleton.EagerInitializedSingleton 1. Eager
 *      Initialized Singleton
 * @see com.ankurmaurya.creational.singleton.StaticBlockInitializedSingleton 2.
 *      Static Block Initialization
 * @see com.ankurmaurya.creational.singleton.LazyInitializedSingleton 3. Lazy
 *      Initialization
 * @see com.ankurmaurya.creational.singleton.ThreadSafeSingleton 4. Thread Safe
 *      Singleton
 * @see com.ankurmaurya.creational.singleton.BillPughSingleton 5. Bill Pugh
 *      Singleton
 * @see com.ankurmaurya.creational.singleton.ReflectionDestroySingleton 6. Using
 *      Reflection to destroy Singleton Pattern
 * @see com.ankurmaurya.creational.singleton.EnumSingleton 7. Enum Singleton
 * @see com.ankurmaurya.creational.singleton.SerializedClonedSingleton 8.
 *      Serialization and Cloning Singleton
 * 
 * 
 * 
 * @author Ankur Maurya
 * 
 */

public class Singleton {

	public static void main(String[] args) throws Exception {

		// Eager Initialization
		EagerInitializedSingleton eis = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton eis1 = EagerInitializedSingleton.getInstance();
		System.out.println("1. Eager Initialization");
		System.out.println(eis);
		System.out.println(eis1);
		System.out.println();

		// Static Block Initialization
		StaticBlockInitializedSingleton sbi = StaticBlockInitializedSingleton.getInstance();
		StaticBlockInitializedSingleton sbi1 = StaticBlockInitializedSingleton.getInstance();
		System.out.println("2. Static Block Initialization");
		System.out.println(sbi);
		System.out.println(sbi1);
		System.out.println();

		// Lazy Initialization
		LazyInitializedSingleton li = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton li1 = LazyInitializedSingleton.getInstance();
		System.out.println("3. Lazy Initialization");
		System.out.println(li);
		System.out.println(li1);
		LazyInitializedSingleton.nullInstance();

		System.out.println("-> Multi-Threads Break Lazy Initialization");
		ExecutorService executor = Executors.newFixedThreadPool(3);
		Runnable r1 = () -> System.out.println("   " + LazyInitializedSingleton.getInstance());
		executor.submit(r1);
		executor.submit(r1);
		executor.submit(r1);
		Thread.sleep(1000);
		executor.shutdown();
		System.out.println();

		// Thread Safe Singleton
		ThreadSafeSingleton tss = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton tss1 = ThreadSafeSingleton.getInstanceUsingDoubleCheckedLocking();
		System.out.println("4. Thread Safe Singleton");
		System.out.println(tss);
		System.out.println(tss1);
		ThreadSafeSingleton.nullInstance();

		System.out.println("-> Multi-Threads does not break Thread Safe Singleton");
		ExecutorService executortss = Executors.newFixedThreadPool(3);
		Runnable r2 = () -> System.out.println("   " + ThreadSafeSingleton.getInstance());
		executortss.submit(r2);
		executortss.submit(r2);
		executortss.submit(r2);
		Thread.sleep(1000);
		executortss.shutdown();
		System.out.println();

		// Bill Pugh Singleton Implementation
		BillPughSingleton bps = BillPughSingleton.getInstance();
		BillPughSingleton bps1 = BillPughSingleton.getInstance();
		System.out.println("5. Bill Pugh Singleton Implementation");
		System.out.println(bps);
		System.out.println(bps1);
		System.out.println("-> Multi-Threads does not break Bill Pugh Singleton Implementation");
		ExecutorService executorbss = Executors.newFixedThreadPool(3);
		Runnable r3 = () -> System.out.println("   " + BillPughSingleton.getInstance());
		executorbss.submit(r3);
		executorbss.submit(r3);
		executorbss.submit(r3);
		Thread.sleep(1000);
		executorbss.shutdown();
		System.out.println();

		// Use Reflection to Destroy Singleton Pattern
		EagerInitializedSingleton rds = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton rds1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton rds2 = ReflectionDestroySingleton.getReflectionDestroyedSingleton();
		System.out.println("6. Use Reflection to Destroy Singleton Pattern");
		System.out.println(rds);
		System.out.println(rds1);
		System.out.println("Singleton broked with Reflection -> ");
		System.out.println(rds2);
		System.out.println();

		// Enum Singleton
		System.out.println("7. Enum Singleton");
		EnumSingleton.INSTANCE.setSomething("Ankur Maurya");
		EnumSingleton.INSTANCE.doSomething();
		String something = EnumSingleton.INSTANCE.getSomething();
		System.out.println("Enum Instance Member Value - " + something);
		System.out.println();

		// Enum Singleton
		System.out.println("8. Serialization and Cloning Singleton");
		System.out.println("-> Serializable");
		SerializedClonedSingleton serS1 = SerializedClonedSingleton.getInstance();
		System.out.println(serS1.hashCode());
		SerializedClonedSingleton.breakSingleton();
		System.out.println("-> Cloneable");
		SerializedClonedSingleton serC1 = (SerializedClonedSingleton) serS1.clone();
		System.out.println(serC1.hashCode());
		System.out.println();

	}

}
