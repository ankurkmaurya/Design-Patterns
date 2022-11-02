package com.ankurmaurya.structural.decorator;

/**
 * 
 * <h1>Decorator Design Pattern</h1>
 * <p>
 * Decorator is a structural design pattern that lets you attach new behaviors
 * to objects by placing these objects inside special wrapper objects that
 * contain the behaviors.
 * </p>
 * <p>
 * Decorator design pattern is used to modify the functionality of an object at
 * runtime. At the same time other instances of the same class will not be
 * affected by this, so individual object gets the modified behavior.
 * </p>
 * <p>
 * We use inheritance or composition to extend the behavior of an object but
 * this is done at compile time and its applicable to all the instances of the
 * class. We can add any new functionality of remove any existing behavior at
 * runtime - this is when Decorator pattern comes into picture.
 * </p>
 * 
 * 
 * <h3>Procedure :</h3>
 * <ol>
 * <li>Create an interface.</li>
 * <li>Create concrete classes implementing the same interface.</li>
 * <li>Create an abstract decorator class implementing the above same
 * interface.</li>
 * <li>Create a concrete decorator class extending the above abstract decorator
 * class.</li>
 * <li>Now use the concrete decorator class created above to decorate interface
 * objects.</li>
 * </ol>
 * 
 * 
 * <h3>Points :</h3>
 * <ul>
 * <li>A Decorator pattern can be used to attach additional responsibilities to
 * an object either statically or dynamically.</li>
 * <li>A Decorator provides an enhanced interface to the original object.</li>
 * <li>In the implementation of this pattern, we prefer composition over an
 * inheritance – so that we can reduce the overhead of sub-classing again and
 * again for each decorating element. The recursion involved with this design
 * can be used to decorate our object as many times as we require.</li>
 * <li>The decorator design pattern is also known as Wrapper, because it offers
 * a wrapper to an existing class. To implement the wrapper, this approach uses
 * abstract classes or interfaces with composition.</li>
 * <li>We need Decorator Design Pattern
 * <ol>
 * <li>When one has an object that requires functionality extension. For
 * extending functionality, decorators are a versatile alternative to
 * sub-classing.</li>
 * <li>When one has to recursively re-wrap or change the functionalities of an
 * object according to the requirements, dynamically without affecting other
 * objects of the class.</li>
 * </ol>
 * </li>
 * <li>Use the Decorator pattern when you need to be able to assign extra
 * behaviors to objects at runtime without breaking the code that uses these
 * objects.</li>
 * <li><i>Use the pattern when it’s awkward or not possible to extend an
 * object’s behavior using inheritance.</i><br>
 * Many programming languages have the final keyword that can be used to prevent
 * further extension of a class. For a final class, the only way to reuse the
 * existing behavior would be to wrap the class with your own wrapper, using the
 * Decorator pattern.</li>
 * <li>Adapter provides a different interface to the wrapped object, Proxy
 * provides it with the same interface, and Decorator provides it with an
 * enhanced interface.</li>
 * <li>Composite and Decorator have similar structure diagrams since both rely
 * on recursive composition to organize an open-ended number of objects.</li>
 * <li>Decorator lets you change the skin of an object, while Strategy lets you
 * change the guts.</li>
 * <li>Decorator and Proxy have similar structures, but very different intents.
 * Both patterns are built on the composition principle, where one object is
 * supposed to delegate some of the work to another. The difference is that a
 * Proxy usually manages the life cycle of its service object on its own,
 * whereas the composition of Decorators is always controlled by the
 * client.</li>
 * </ul>
 * 
 * 
 * <h3>Decorator Design Pattern Example in JDK :</h3>
 * <ul>
 * <li>All subclasses of <i>java.io.InputStream</i>, <i>OutputStream</i>,
 * <i>Reader</i> and <i>Writer</i> have constructors that accept objects of
 * their own type.</li>
 * <li>java.util.Collections, methods <i>checkedXXX()</i>,
 * <i>synchronizedXXX()</i> and <i>unmodifiableXXX()</i>.</li>
 * <li><i>javax.servlet.http.HttpServletRequestWrapper</i> and
 * <i>HttpServletResponseWrapper</i></li>
 * </ul>
 * 
 * 
 * @author Ankur Maurya
 * 
 * 
 */

public class Decorator {

	public static void main(String[] args) {
		
		System.out.println("---- Decorator Pattern Implementation ----");
		Writer fileWriter = new DataEncrypModifier(new DataCompressModifier(new FileWriter()));
		fileWriter.writeData("I am a Decorator for File Writer.");

		Writer streamWriter = new DataEncrypModifier(new DataCompressModifier(new StreamWriter()));
		streamWriter.writeData("I am a Decorator for Stream Writer.");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
