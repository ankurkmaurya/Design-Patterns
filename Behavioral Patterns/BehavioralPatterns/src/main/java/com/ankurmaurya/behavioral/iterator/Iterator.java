package com.ankurmaurya.behavioral.iterator;

/**
 * 
 * <h3>Iterator Design Pattern</h3>
 * <p>
 * Provides a way to access the elements of an aggregate object without exposing
 * its underlying representation.
 * </p>
 * <p>
 * The iterator design is responsible to encapsulate(hide) the complexities of
 * dealing with a complicated data structure and provides the client with a
 * number of straightforward ways for retrieving collection members.
 * </p>
 * <p>
 * Iterator pattern is not only about traversing through a collection, but we
 * can also provide different kinds of iterators based on our requirements.
 * Iterator pattern hides the actual implementation of traversal through the
 * collection and client programs just use iterator methods.
 * </p>
 * 
 * 
 * <h3>Structure :</h3>
 * <ol>
 * <li><b>Iterator :</b> It is defined as the method for accessing or traversing
 * the elements list. It is responsible for providing methods that concrete
 * iterators need to follow as well as implement.</li>
 * <li><b>ConcreteIterator :</b> Iterator interface functions are implemented by
 * 'ConcreteIterator'. It is a class responsible for maintaining a track of the
 * present location in the aggregate collection traverse.</li>
 * <li><b>Aggregate :</b> The fourth design participant is the aggregate which
 * is defined as a collection interface that offers a function for creating an
 * Iterator object.</li>
 * <li><b>ConcreteAggregate :</b> It is the last required participant which
 * takes care of the implementation of the Aggregate interface.
 * ConcreteAggregate's particular method yields a ConcreteIterator object.</li>
 * </ol>
 * 
 * 
 * <p>
 * <h3>Point :</h3>
 * <li>Iterator pattern is useful when you want to provide a standard way to
 * iterate over a collection and hide the implementation logic from client
 * program.</li>
 * <li>The logic for iteration is embedded in the collection itself and it helps
 * client program to iterate over them easily.</li>
 * <li>The abstract syntax tree of Interpreter is a Composite (therefore
 * Iterator and Visitor are also applicable).</li>
 * <li>Iterator can traverse a Composite. Visitor can apply an operation over a
 * Composite.</li>
 * <li>Polymorphic Iterators rely on Factory Methods to instantiate the
 * appropriate Iterator subclass.</li>
 * <li>Memento is often used in conjunction with Iterator. An Iterator can use a
 * Memento to capture the state of an iteration. The Iterator stores the Memento
 * internally.</li>
 * </p>
 * 
 * 
 * 
 * @author Ankur Maurya
 * 
 */


public class Iterator {

	public static void main(String[] args) {

		System.out.println("------ Iterator Design Pattern Implementation ------");
		
		ChannelCollection channels = new ChannelCollectionImpl();
		channels.addChannel(new Channel(98.5, ChannelType.ENGLISH));
		channels.addChannel(new Channel(99.5, ChannelType.HINDI));
		channels.addChannel(new Channel(100.5, ChannelType.FRENCH));
		channels.addChannel(new Channel(101.5, ChannelType.ENGLISH));
		channels.addChannel(new Channel(102.5, ChannelType.HINDI));
		channels.addChannel(new Channel(103.5, ChannelType.FRENCH));
		channels.addChannel(new Channel(104.5, ChannelType.ENGLISH));
		channels.addChannel(new Channel(105.5, ChannelType.HINDI));
		channels.addChannel(new Channel(106.5, ChannelType.FRENCH));
		
		ChannelIterator baseIterator = channels.iterator(ChannelType.ALL);
		while (baseIterator.hasNext()) {
			Channel c = baseIterator.next();
			System.out.println(c.toString());
		}
		
		System.out.println("ENGLISH CHANNELS -> ");
		ChannelIterator englishIterator = channels.iterator(ChannelType.ENGLISH);
		while (englishIterator.hasNext()) {
			Channel c = englishIterator.next();
			System.out.println(c.toString());
		}
		
		System.out.println("HINDI CHANNELS -> ");
		ChannelIterator hindiIterator = channels.iterator(ChannelType.HINDI);
		while (hindiIterator.hasNext()) {
			Channel c = hindiIterator.next();
			System.out.println(c.toString());
		}
		

	}

}
