package com.ankurmaurya.singleton;

/**
 * 
 * <p>
 * <h3>Bill Pugh Singleton</h3>
 * <ul>
 * <li>Prior to Java 5, java memory model had a lot of issues and the Thread
 * Safe Singleton approaches used to fail in certain scenarios where too many
 * threads try to get the instance of the Singleton class simultaneously. So
 * <i>Bill Pugh</i> came up with a different approach to create the Singleton
 * class using an inner static helper class.</li>
 * <li>The private inner static class contains the instance of the singleton
 * class.</li>
 * <li>When this <i>BillPughSingleton</i> class is loaded, <i>BillPughSingletonHelper</i>
 * class is not loaded into memory and only when someone calls the getInstance
 * method, this class gets loaded and creates the Singleton class instance.</li>
 * <li>It is the most widely used approach for Singleton class as it doesn’t
 * require synchronization.</li>
 * </ul>
 * </p>
 * 
 * 
 * @author Ankur Maurya
 *
 *
 */

public class BillPughSingleton {

	private static class BillPughSingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return BillPughSingletonHelper.INSTANCE;
	}

	// private constructor to avoid client applications to use constructor
	private BillPughSingleton() {
	}
	
	public void display() {
		System.out.println("Display -> 1");
	}

}
