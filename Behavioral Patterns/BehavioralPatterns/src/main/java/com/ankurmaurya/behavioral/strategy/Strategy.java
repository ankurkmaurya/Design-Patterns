package com.ankurmaurya.behavioral.strategy;

/**
 * 
 * <h3>Strategy Design Pattern</h3>
 * <p>
 * Strategy is a behavioral design pattern that turns a set of behaviors into
 * objects and makes them interchangeable inside original context object.
 * </p>
 * <p>
 * Strategy pattern is used when we have multiple algorithms for a specific
 * task, and the client decides the actual implementation be used at
 * runtime.<br>
 * A strategy pattern is also known as a policy pattern.<br>
 * We define multiple algorithms and let client applications pass the algorithm
 * to be used as a parameter.
 * </p>
 * 
 * 
 * 
 * <h3>Structure :</h3>
 * <ol>
 * <li><b>Context :</b> It maintains a reference to one of the concrete
 * strategies and communicates with this object only via the strategy
 * interface.</li>
 * <li><b>Strategy :</b> The Strategy interface is common to all concrete
 * strategies. It declares a method the context uses to execute a strategy.</li>
 * <li><b>Concrete Strategies :</b> It implement different variations of an
 * algorithm the context uses.</li>
 * <li>The context calls the execution method on the linked strategy object each
 * time it needs to run the algorithm. The context doesn’t know what type of
 * strategy it works with or how the algorithm is executed.</li>
 * <li><b>Client :</b> The Client creates a specific strategy object and passes
 * it to the context. The context exposes a setter which lets clients replace
 * the strategy associated with the context at runtime.</li>
 * </ol>
 * 
 * 
 * 
 * <p>
 * <h3>Point :</h3>
 * <li>Use the Strategy pattern when you want to use different variants of an
 * algorithm within an object and be able to switch from one algorithm to
 * another during runtime.</li>
 * <li>Use the Strategy when you have a lot of similar classes that only differ
 * in the way they execute some behavior.</li>
 * <li>Strategy pattern is useful when we have multiple algorithms for specific
 * task and we want our application to be flexible to chose any of the algorithm
 * at runtime for specific task.</li>
 * <li>Use the pattern when your class has a massive conditional statement that
 * switches between different variants of the same algorithm.</li>
 * <li>Decorator lets you change the skin of an object, while Strategy lets you
 * change the guts.</li>
 * <li>Template Method is based on inheritance: it lets you alter parts of an
 * algorithm by extending those parts in subclasses. Strategy is based on
 * composition: you can alter parts of the object’s behavior by supplying it
 * with different strategies that correspond to that behavior. Template Method
 * works at the class level, so it’s static. Strategy works on the object level,
 * letting you switch behaviors at runtime.</li>
 * </ol>
 * </p>
 * 
 *
 * @author Ankur Maurya
 * 
 * 
 */

public class Strategy {

	public static void main(String[] args) {
		System.out.println("------ Strategy Design Pattern Implementation ------");

		System.out.println("--> Impl. Type First");
		int value1 = 10;
		int value2 = 3;
		Context context = new Context(new AdditionStrategy());          
        System.out.println("Addition = " + context.executeStrategy(value1, value2));  
        context = new Context(new SubtractionStrategy());       
        System.out.println("Subtraction = " + context.executeStrategy(value1, value2));  
        context = new Context(new MultiplicationStrategy());        
        System.out.println("Multiplication = " + context.executeStrategy(value1, value2));  
        System.out.println("");
        
        System.out.println("--> Impl. Type Second");
        StrategyII strategyTwo = new StrategyIIImpl(value1, value2);
        System.out.println("Addition = " + strategyTwo.calculate((v1, v2)-> v1 + v2)); 
        System.out.println("Subtraction = " + strategyTwo.calculate((v1, v2)-> v1 - v2));
        System.out.println("Multiplication = " + strategyTwo.calculate((v1, v2)-> v1 * v2));
        
        
	}

}
