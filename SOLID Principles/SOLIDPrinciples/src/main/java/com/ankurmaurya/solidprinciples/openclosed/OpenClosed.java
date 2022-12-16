package com.ankurmaurya.solidprinciples.openclosed;

/**
 * 
 * <h1>Open for Extension, Closed for Modification</h1>
 * <p>
 * <b>Classes should be open for extension but closed for modification.</b> In
 * doing so, we stop ourselves from modifying existing code and causing
 * potential new bugs in an otherwise happy application.
 * </p>
 * <p>
 * </p>
 * 
 * <h3>Extending the class can be done in a variety of ways, including</h3>
 * <ul>
 * <li>Inheriting from class.</li>
 * <li>Overwriting the required behaviour from the class.</li>
 * <li>Extending certain behaviour of the class. </li>
 * </ul>
 * 
 * 
 * @author Ankur Maurya
 * 
 * 
 */

public class OpenClosed {

	public static void main(String[] args) {
		System.out.println("------ Open/Closed Principles ------");

		Student s1 = new Student("Mahendra", "Class-6", new Science("SCIENCE"));
		Student s2 = new Student("Mahesh", "Class-4", new Arts("ARTS"));
		Student s3 = new Student("Ankur", "Class-1", new Commerce("COMMERCE"));
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
	}

}
