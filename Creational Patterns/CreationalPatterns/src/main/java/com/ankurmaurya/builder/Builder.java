package com.ankurmaurya.builder;

import java.time.Year;

/**
 * 
 * <h1>Builder Design Pattern</h1>
 * 
 * Builder is a creational design pattern that lets you construct complex
 * objects step by step. The pattern allows you to produce different types and
 * representations of an object using the same construction code.
 * 
 * 
 * <h3>Structure :</h3> The Reader encapsulates the parsing of the common input.
 * The Builder hierarchy makes possible the polymorphic creation of many
 * peculiar representations or targets.
 * 
 * 
 * <h3>Points :</h3>
 * <ul>
 * <li>Use the Builder pattern when you want your code to be able to create
 * different representations of some product.</li>
 * <li>The Builder pattern can be applied when construction of various
 * representations of the product involves similar steps that differ only in the
 * details.</li>
 * <li>The Builder pattern can be recognized in a class, which has a single
 * creation method and several methods to configure the resulting object.</li>
 * <li>Builder methods often support chaining (for example,
 * someBuilder.setValueA(1).setValueB(2).create()).</li>
 * <li>The only big difference between the builder pattern and the abstract
 * factory pattern is that builder provides us more control over the object
 * creation process.</li>
 * <li>With Builder pattern, you can create objects that have many optional
 * parameters without using cumbersome and error-prone telescoping constructors.
 * Further, the pattern avoids mixing up parameter values in large constructors
 * that often have multiple consecutive parameters of the same type.</li>
 * <li>The same Builder instance can be used to create other objects of the same
 * type that have slightly different attribute values than the one created in
 * the first construction process.</li>
 * <li>The Builder pattern also allows for easy state validation by implementing
 * or calling the validation logic in the build method, before the actual object
 * is created. This avoids the creation of objects with invalid state.</li>
 * <li>When the pattern is used with records, there is no code duplication as is
 * the case with regular classes, which require the same fields to be specified
 * in the Product and Builder classes.</li>
 * <li>Refer :
 * <a>https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java</a></li>
 * </ul>
 * 
 * 
 * <h3>Builder Design Pattern examples in JDK</h3>
 * <ul>
 * <li>java.lang.StringBuilder#append() (unsynchronized)</li>
 * <li>java.lang.StringBuffer#append() (synchronized)</li>
 * </ul>
 * 
 * 
 * @author Ankur Maurya
 * 
 * 
 */

public class Builder {

	public static void main(String[] args) {
		
		Book book = new Book.Builder("0-12-345678-9", "Moby-Dick").genre(Genre.ADVENTURE_FICTION)
				.author("Herman Melville").published(Year.of(1851))
				.description("The book is the sailor Ishmael's narrative of the obsessive quest of "
						+ "Ahab, captain of the whaling ship Pequod, for revenge on Moby Dick, "
						+ "the giant white sperm whale that on the ship's previous voyage bit "
						+ "off Ahab's leg at the knee.")
				.build();
		System.out.println(book.toString());
		System.out.println();
		
		
		/*
		 * Builder's Limitations :
		 * The example below is not very realistic, because you
		 * also would have to change the ISBN which is not possible since the ISBN field
		 * is final and, therefore, must be set via the Builder’s constructor. This, in
		 * turn, would result in the creation of a new Book instance. That example
		 * reveals the limits of the Builder’s reusability.
		 * 
		 */
		System.out.println("----- Builder's Reusability -----");
		Book.Builder bookBuilder = new Book.Builder("0-12-345678-9", "Moby-Dick").genre(Genre.ADVENTURE_FICTION)
				.author("Herman Melville").published(Year.of(1851)).description("description ABCD");

		// Create a first Book object
		Book book1 = bookBuilder.build();
		System.out.println(book1.toString());
		System.out.println();

		// Create a second, slightly different, object reusing the same Builder instance
		book1 = bookBuilder.published(Year.of(1952)).build();
		System.out.println(book1.toString());
		System.out.println();

	}

	
	
}

