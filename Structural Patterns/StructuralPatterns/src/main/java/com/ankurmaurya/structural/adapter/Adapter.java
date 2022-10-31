package com.ankurmaurya.structural.adapter;

/**
 * 
 * <h1>Adapter Design Pattern</h1>
 * <p>
 * The adapter design pattern is one of the structural design patterns and it’s
 * used so that two unrelated interfaces can work together. The object that
 * joins these unrelated interfaces is called an Adapter.
 * </p>
 * 
 * 
 * <h3>Structure :</h3>
 * <ol>
 * <li>Convert the interface of a class into another interface clients expect.
 * Adapter lets classes work together that couldn't otherwise because of
 * incompatible interfaces.</li>
 * <li>Wrap an existing class with a new interface.</li>
 * <li>Impedance match an old component to a new system</li>
 * </ol>
 * 
 * <h3>Two Way Adapter Pattern :</h3>
 * <p>
 * While implementing Adapter pattern, there are two approaches - class adapter
 * and object adapter - however both these approaches produce same result.
 * </p>
 * <ol>
 * <li><b>Class Adapter -</b> This form uses java inheritance and extends the
 * source interface, in our case Socket class.</li>
 * <li><b>Object Adapter -</b> This form uses Java Composition and adapter
 * contains the source object.</li>
 * </ol>
 * 
 * 
 * <h3>Points :</h3>
 * <ul>
 * <li>Adapter is about creating an intermediary abstraction that translates, or
 * maps, the old component to the new system.</li>
 * <li>Clients call methods on the Adapter object which redirects them into
 * calls to the legacy component. This strategy can be implemented either with
 * inheritance or with aggregation.</li>
 * <li>Adapter functions as a wrapper or modifier of an existing class. It
 * provides a different or translated view of that class.</li>
 * <li>Adapter makes things work after they're designed; Bridge makes them work
 * before they are.</li>
 * <li>Bridge is designed up-front to let the abstraction and the implementation
 * vary independently. Adapter is retrofitted to make unrelated classes work
 * together.</li>
 * <li>Adapter provides a different interface to its subject. Proxy provides the
 * same interface. Decorator provides an enhanced interface.</li>
 * <li>Adapter is meant to change the interface of an existing object. Decorator
 * enhances another object without changing its interface. Decorator is thus
 * more transparent to the application than an adapter is. As a consequence,
 * Decorator supports recursive composition, which isn't possible with pure
 * Adapters.</li>
 * <li><b>Note : </b>Facade defines a new interface, whereas Adapter reuses an
 * old interface. Remember that Adapter makes two existing interfaces work
 * together as opposed to defining an entirely new one.</li>
 * </ul>
 * 
 * 
 * <h3>Adapter Design Pattern Example in JDK :</h3>
 * <ul>
 * <li>java.util.Arrays#asList()</li>
 * <li>java.io.InputStreamReader(InputStream) (returns a Reader)</li>
 * <li>java.io.OutputStreamWriter(OutputStream) (returns a Writer)</li>
 * </ul>
 * 
 * 
 * @author Ankur Maurya
 * 
 */

public class Adapter {

	public static void main(String[] args) {

		System.out.println("1. Object Adapter Implementation.");
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronOAdapter = new MovableObjectAdapterImpl(bugattiVeyron);
		System.out.println("MPH - " + bugattiVeyron.getSpeed());
		System.out.println("KM/H - " + bugattiVeyronOAdapter.getSpeed());
		System.out.println();
		System.out.println("2. Class Adapter Implementation.");
		MovableAdapter bugattiVeyronCAdapter = new MovableClassAdapterImpl();
		System.out.println("MPH - " + bugattiVeyron.getSpeed());
		System.out.println("KM/H - " + bugattiVeyronCAdapter.getSpeed());
		
		
	}

}
