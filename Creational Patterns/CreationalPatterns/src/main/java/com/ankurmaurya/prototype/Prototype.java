package com.ankurmaurya.prototype;

/**
 * 
 * <p>
 * <h1>Prototype Design Pattern</h1> Prototype design pattern is used when the
 * Object creation is a costly affair and requires a lot of time and resources
 * and you have a similar object already existing. Prototype pattern provides a
 * mechanism to copy the original object to a new object and then modify it
 * according to our needs. Prototype design pattern uses java cloning to copy
 * the object.
 * </p>
 * 
 * <h3>Structure :</h3> The Factory knows how to find the correct Prototype, and
 * each Product knows how to spawn new instances of itself.
 * 
 * <h3>Prototype Design Participants :</h3>
 * <ol>
 * <li><b>Prototype :</b> This is the prototype of an actual object.</li>
 * <li><b>Prototype Registry :</b> This is used as a registry service to have
 * all prototypes accessible using simple string parameters.</li>
 * <li><b>Client :</b> Client will be responsible for using registry service to
 * access prototype instances.</li>
 * </ol>
 * 
 * <h3>Points :</h3>
 * <ul>
 * <li>The Prototype pattern is generally used when we have an instance of the
 * class (prototype) and we'd like to create new objects by just copying the
 * prototype.</li>
 * <li>Prototype doesn't require sub-classing, but it does require an
 * "initialize" operation.</li>
 * <li>Designs that make heavy use of the Composite and Decorator patterns often
 * can benefit from Prototype as well.</li>
 * <li>Prototypes are useful when object initialization is expensive, and you
 * anticipate few variations on the initialization parameters. In this context,
 * Prototype can avoid expensive "creation from scratch", and support cheap
 * cloning of a preinitialized prototype.</li>
 * <li>Prototype patterns are required, when object creation is time consuming,
 * and costly operation, so we create objects with the existing object
 * itself.</li>
 * </ul>
 * 
 * 
 * <h3>Advantages & Disadvantages</h3>
 * <ul>
 * <li>It is handy when our new object is only slightly different from our
 * existing one. In some cases, instances may have only a few combinations of
 * state in a class. So instead of creating new instances, we may create the
 * instances with the appropriate state beforehand and then clone them whenever
 * we want.</li>
 * <li>Sometimes, we might encounter subclasses that differ only in their state.
 * We can eliminate those subclasses by creating prototypes with the initial
 * state and then cloning them.</li>
 * <li>Prototype pattern, just like every other design pattern, should be used
 * only when it's appropriate. Since we are cloning the objects, the process
 * could get complex when there are many classes, thereby resulting in a mess.
 * Additionally, it's difficult to clone classes that have circular
 * references.</li>
 * </ul>
 * 
 * 
 * @author Ankur Maurya
 * 
 */

public class Prototype {

	public static void main(String[] args) {
		try {
			String moviePrototype = PrototypeFactory.getInstance(PrototypeType.MOVIE).initName("KANTARA").toString();
			System.out.println(moviePrototype);

			String albumPrototype = PrototypeFactory.getInstance(PrototypeType.ALBUM).initName("ROCKING").toString();
			System.out.println(albumPrototype);

			String showPrototype = PrototypeFactory.getInstance(PrototypeType.SHOW).initName("STANDUP COMEDY")
					.toString();
			System.out.println(showPrototype);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	

}
