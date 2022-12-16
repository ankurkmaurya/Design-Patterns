package com.ankurmaurya.solidprinciples.singleresponsibility;

/**
 * 
 * <h1>Single Responsibility</h1>
 * <p>
 * This principle states that a class should only have one responsibility.
 * Furthermore, it should only have one reason to change.
 * </p>
 * <p>
 * </p>
 * 
 * <h3>How does this principle help us to build better software?</h3>
 * <ol>
 * <li><b>Testing –</b> A class with one responsibility will have far fewer test
 * cases.</li>
 * <li><b>Lower Coupling –</b> Less functionality in a single class will have
 * fewer dependencies.</li>
 * <li><b>Organization –</b> Smaller, well-organized classes are easier to
 * search than monolithic ones.</li>
 * </ol>
 * 
 * 
 * 
 * @author Ankur Maurya
 * 
 */

public class SingleResponsibility {

	public static void main(String[] args) {
		System.out.println("------ Single Responsibility Principles ------");

		Book b1 = new Book("Effective Design", "Martin",
				"Even if many synchronizers (locks, semaphores, blocking queue etc.) are different in function, "
						+ "they are often not that different in their internal design. In other words, they consist of the "
						+ "same (or similar) basic parts internally. Knowing these basic parts can be a great help when "
						+ "designing synchronizers. It is these parts this text looks closer at.");

		System.out.println("different - " + b1.isWordInText("different"));
		System.out.println("Replace  different with diff..* - " + b1.replaceWordInText("different", "diff..*"));

		System.out.println("Bad Design --->");
		BadBook bb = new BadBook("System Design", "Fowler",
				"The purpose of most (if not all) synchronizers is to guard some area of the code "
						+ "(critical section) from concurrent access by threads. To do this the following parts are "
						+ "often needed in a synchronizer");
		bb.printTextToConsole();

		System.out.println("Good Design --->");
		BookPrinter bprint = new BookPrinter();
		bprint.printTextToConsole(b1.getText());

	}

}
