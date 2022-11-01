package com.ankurmaurya.structural.proxy;

/**
 * 
 * <h1>Proxy Design Pattern</h1>
 * <p>
 * Proxy pattern intent is to “Provide a surrogate or placeholder for another
 * object to control access to it”. The definition itself is very clear and
 * proxy pattern is used when we want to provide controlled access of a
 * functionality.
 * </p>
 * 
 * 
 * <h3>Structure :</h3>
 * <ul>
 * <li>By defining a Subject interface, the presence of the Proxy object
 * standing in place of the RealSubject is transparent to the client.</li>
 * <li><b>Steps:</b>
 * <ol>
 * <li>Create a "wrapper" for a remote, or expensive, or sensitive target.</li>
 * <li>Encapsulate the complexity/overhead of the target in the wrapper.</li>
 * <li>The client deals with the wrapper.</li>
 * <li>The wrapper delegates to the target.</li>
 * <li>To support plug-compatibility of wrapper and target, create an
 * interface.</li>
 * </ol>
 * </li>
 * </ul>
 * 
 * 
 * <h3>Points :</h3>
 * <ul>
 * <li>Provide a surrogate or placeholder for another object to control access
 * to it.</li>
 * <li>Use an extra level of indirection to support distributed, controlled, or
 * intelligent access.</li>
 * <li>Add a wrapper and delegation to protect the real component from undue
 * complexity.</li>
 * <li>A smart proxy interposes additional actions when an object is accessed.
 * Typical uses include:
 * <ol>
 * <li>Counting the number of references to the real object so that it can be
 * freed automatically when there are no more references (aka smart
 * pointer)</li>
 * <li>Loading a persistent object into memory when it's first referenced.</li>
 * <li>Checking that the real object is locked before it is accessed to ensure
 * that no other object can change it.</li>
 * </ol>
 * </li>
 * <li>Adapter provides a different interface to its subject. Proxy provides the
 * same interface. Decorator provides an enhanced interface.</li>
 * <li>Decorator and Proxy have different purposes but similar structures. Both
 * describe how to provide a level of indirection to another object, and the
 * implementations keep a reference to the object to which they forward
 * requests.</li>
 * <li>Proxy design pattern common uses are to control access or to provide a
 * wrapper implementation for better performance. Java RMI package uses proxy
 * pattern.</li>
 * </ul>
 * 
 * 
 * <h3>Types of Proxies (Applicability) : </h3>
 * <ul>
 * <li><b>Virtual Proxy (Lazy initialization) - </b> This is when you have a
 * heavyweight service object that wastes system resources by being always up,
 * even though you only need it from time to time.</li>
 * <li><b>Protection Proxy (Access control) - </b> This is when you want only
 * specific clients to be able to use the service object; for instance, when
 * your objects are crucial parts of an operating system and clients are various
 * launched applications (including malicious ones).</li>
 * <li><b>Remote Proxy - </b> Local execution of a remote service. This is when
 * the service object is located on a remote server.</li>
 * <li><b>Logging Proxy (Logging requests) - </b> This is when you want to keep
 * a history of requests to the service object.</li>
 * <li><b>Caching Proxy (Caching request results) - </b> This is when you need
 * to cache results of client requests and manage the life cycle of this cache,
 * especially if results are quite large.</li>
 * <li><b>Smart Reference - </b> This is when you need to be able to dismiss a
 * heavyweight object once there are no clients that use it.</li>
 * </ul>
 * 
 * 
 * @author Ankur Maurya
 * 
 */

public class Proxy {

	public static void main(String[] args) {
		CommandExecutor adminExecutor = new CommandExecutorProxy("admin", "ABCD1234");
		CommandExecutor normalExecutor = new CommandExecutorProxy("user", "1234");
		try {
			System.out.println("--- Proxy Pattern ---");
			System.out.println("ADMIN USER - ");
			adminExecutor.runCommand("cmd.exe dir \"C:\"");
			adminExecutor.runCommand("systeminfo");
			
			System.out.println("RESTRICTED USER - ");
			normalExecutor.runCommand("cmd.exe dir \"C:\"");
			normalExecutor.runCommand("systeminfo");
		} catch (Exception e) {
			System.out.println("Exception Message : "+e.getMessage());
		}
		
		
		
	}

}
