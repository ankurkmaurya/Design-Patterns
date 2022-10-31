package com.ankurmaurya.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 * <p>
 * <h3>Serialization and Singleton</h3>
 * <ul>
 * <li>Sometimes we need to implement Serializable interface in Singleton class
 * so that we can store its state in the file system and retrieve it at a later
 * point of time.</li>
 * <li><b>Problem : </b>The problem with serialized singleton class is that
 * whenever we deserialize it, it will create a new instance of the class.</li>
 * <li><b>Solution : </b>Serialization destroys the singleton pattern, to
 * overcome this scenario all we need to do it provide the implementation of
 * <i>readResolve()</i> method.</li>
 * <li><b>Note : </b>For Serializable and Externalizable classes, the
 * <i>readResolve</i> method allows a class to replace/resolve the object read
 * from the stream before it is returned to the caller. By implementing the
 * <i>readResolve</i> method, a class can directly control the types and
 * instances of its own instances being deserialized.The readResolve method is
 * called when ObjectInputStream has read an object from the stream and is
 * preparing to return it to the caller. ObjectInputStream checks whether the
 * class of the object defines the readResolve method. If the method is defined,
 * the readResolve method is called to allow the object in the stream to
 * designate the object to be returned. The object returned should be of a type
 * that is compatible with all uses. If it is not compatible, a
 * ClassCastException will be thrown when the type mismatch is discovered.</li>
 * </ul>
 * </p>
 * 
 * 
 * @author Ankur Maurya
 *
 */

public class SerializedSingleton implements Serializable {

	private static final long serialVersionUID = -7604766932017737115L;

	private SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.instance;
	}

	public static void breakSingleton() throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializedSingleton instanceOne = SerializedSingleton.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
		out.writeObject(instanceOne);
		out.close();

		// Deserailize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
		SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
		in.close();

		System.out.println("Instance-One hashCode = " + instanceOne.hashCode());
		System.out.println("Instance-Two hashCode = " + instanceTwo.hashCode());
	}

	/*
	 * Uncomment below method to resolve the Singleton break issue
	 */
	//protected Object readResolve() {
		//return getInstance();
	//}

}
