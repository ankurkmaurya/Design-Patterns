package com.ankurmaurya.singleton;

import java.lang.reflect.Constructor;

/**
 * 
 * <p>
 * <h3>Use Reflection to Destroy Singleton Pattern</h3>
 * <ul>
 * <li>Reflection can be used to destroy all the singleton implementation
 * approaches except Enum approach.</li>
 * </ul>
 * </p>
 * 
 * 
 * @author Ankur Maurya
 *
 */

public class ReflectionDestroySingleton {

	private ReflectionDestroySingleton() {
	}

	public static EagerInitializedSingleton getReflectionDestroyedSingleton() {
		EagerInitializedSingleton instance = null;
		try {
			Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instance = (EagerInitializedSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return instance;
	}

}
