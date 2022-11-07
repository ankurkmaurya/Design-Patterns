package com.ankurmaurya.behavioral.interpreter;

/**
 * 
 * <h3>Interpreter Design Pattern</h3>
 * <p>
 * This pattern defines the grammar of a particular language in an
 * object-oriented way which can be evaluated by the interpreter itself. Having
 * that in mind, technically we could build our custom regular expression, a
 * custom DSL interpreter or we could parse any of the human languages, build
 * abstract syntax trees and then run the interpretation.
 * </p>
 * <p>
 * </p>
 * 
 * 
 * <h3>Structure :</h3>
 * <ol>
 * <li><b>Abstract Expression (Expression):</b> Declares an interpret()
 * operation that all nodes (terminal and nonterminal) in the AST
 * overrides.</li>
 * <li><b>Terminal Expression (NumberExpression):</b> Implements the interpret()
 * operation for terminal expressions.</li>
 * <li><b>Non-Terminal Expression (AdditionExpression, SubtractionExpression,
 * and MultiplicationExpression):</b> Implement operations the interpret()
 * operation for all nonterminal expressions.</li>
 * <li><b>Context (String):</b> Contains information that is global to the
 * interpreter. It is this String expression with the Postfix notation that has
 * to be interpreted and parsed.</li>
 * <li><b>Client (Expression Parser):</b> Builds (or is provided) the AST
 * assembled from TerminalExpression and NonTerminalExpression. The Client
 * invokes the interpret() operation.</li>
 * </ol>
 * 
 * 
 * <p>
 * <h3>Point :</h3>
 * <li>The interpreter pattern generally should be used when the grammar is
 * relatively simple. Otherwise, it might become hard to maintain.</li>
 * <li>Interpreter can use State to define parsing contexts.</li>
 * <li>The abstract syntax tree of Interpreter is a Composite (therefore
 * Iterator and Visitor are also applicable).</li>
 * <li>Terminal symbols within Interpreter's abstract syntax tree can be shared
 * with Flyweight.</li>
 * <li>The pattern doesn't address parsing. When the grammar is very complex,
 * other techniques (such as a parser) are more appropriate.</li>
 * </p>
 * 
 * 
 * 
 * @author Ankur Maurya
 * 
 * 
 */

public class Interpreter {

	public static void main(String[] args) {

		String[] numWords = { "Eighty four thousand nine hundred forty", "Seven thousand ninety", "One thousand",
				"Six thousand ninety", "One Hundred Ninety Nine", "Six Hundred", "Four Hundred fifty", "Thirty three",
				"One Hundred nine", "Fifty", "Seven", "Ten" };

		System.out.println("------ Interpreter Design Pattern Implementation ------");

		for (String numWord : numWords) {
			System.out.println(numWord);
			System.out.println(EvaluatorUtil.evaluateNumericWords(numWord));
			// System.out.println();
		}

	}

}
