package builder;



//@formatter:off
/**
* 
* Builder Design Pattern
* 
* Builder is a creational design pattern that lets you construct complex objects step by step. 
* The pattern allows you to produce different types and representations of an object using the same construction code.
* 
* 
* Structure : 
* The Reader encapsulates the parsing of the common input. 
* The Builder hierarchy makes possible the polymorphic creation of many peculiar representations or targets.
* 
* 
* Points : 
* -> Use the Builder pattern when you want your code to be able to create different representations of some product.
* -> The Builder pattern can be applied when construction of various representations of the product involves 
*    similar steps that differ only in the details.
* -> The Builder pattern can be recognized in a class, which has a single creation method and several methods to configure the resulting object. 
* -> Builder methods often support chaining (for example, someBuilder.setValueA(1).setValueB(2).create()).
* -> The only big difference between the builder pattern and the abstract factory pattern is that builder 
*    provides us more control over the object creation process.
* 
* 
*     
* 
* Builder Design Pattern examples in JDK
*	- java.lang.StringBuilder#append() (unsynchronized)
*   - java.lang.StringBuffer#append() (synchronized)
* 
* 
* @author Ankur Maurya
* 
* 
*/
//@formatter:on

public class Builder {

	
	public static void main(String[] args) {
		
		
		
	}
	
}
