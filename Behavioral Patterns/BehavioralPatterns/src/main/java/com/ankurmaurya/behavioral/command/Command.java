package com.ankurmaurya.behavioral.command;

/**
 * 
 * <h3>Command Design Pattern</h3>
 * <p>
 * Command is a behavioral design pattern that turns a request into a
 * stand-alone object that contains all information about the request. This
 * transformation lets you pass requests as a method arguments, delay or queue a
 * request’s execution, and support undoable operations.
 * </p>
 * <p>
 * Command design pattern is used to implement loose coupling in a
 * request-response model.<br>
 * The pattern intends to encapsulate in an object all the data required for
 * performing a given action (command), including what method to call, the
 * method's arguments, and the object to which the method belongs.
 * </p>
 * 
 * 
 * <h3>Structure :</h3>
 * <ol>
 * <li>Declare the command interface with a single execution method.</li>
 * <li>Start extracting requests into concrete command classes that implement
 * the command interface. Each class must have a set of fields for storing the
 * request arguments along with a reference to the actual receiver object. All
 * these values must be initialized via the command’s constructor.</li>
 * <li>Identify classes that will act as senders. Add the fields for storing
 * commands into these classes. Senders should communicate with their commands
 * only via the command interface. Senders usually don’t create command objects
 * on their own, but rather get them from the client code.</li>
 * <li>Change the senders so they execute the command instead of sending a
 * request to the receiver directly.</li>
 * <li>The client should initialize objects in the following order:
 * <ul>
 * <li>Create receivers.</li>
 * <li>Create commands, and associate them with receivers if needed.</li>
 * <li>Create senders, and associate them with specific commands.</li>
 * </ul>
 * </li>
 * </ol>
 * 
 * 
 * <p>
 * <h3>Point :</h3>
 * <li>Command is the core of command design pattern that defines the contract
 * for implementation.</li>
 * <li>Receiver implementation is separate from command implementation.</li>
 * <li>Command implementation classes chose the method to invoke on receiver
 * object, for every method in receiver there will be a command implementation.
 * It works as a bridge between receiver and action methods.</li>
 * <li>Invoker class just forward the request from client to the command
 * object.</li>
 * <li>Command design pattern is easily extendible, we can add new action
 * methods in receivers and create new Command implementations without changing
 * the client code.</li>
 * <li>The drawback with Command design pattern is that the code gets huge and
 * confusing with high number of action methods and because of so many
 * associations.</li>
 * <li>Runnable interface (java.lang.Runnable) and Swing Action
 * (javax.swing.Action) uses command pattern.</li>
 * <li>Use the Command pattern when you want to parametrize objects with
 * operations.</li>
 * <li>Use the Command pattern when you want to queue operations, schedule their
 * execution, or execute them remotely.</li>
 * </p>
 * 
 * 
 * @author Ankur Maurya
 * 
 *
 */

public class Command {

	public static void main(String[] args) {

		System.out.println("------ Command Design Pattern Implementation ------");
		FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

		CommandExecutor openFileCommand = new OpenFileCommandExecutor(fs);
		CommandExecutor writeFileCommand = new WriteFileCommandExecutor(fs);
	    CommandExecutor closeFileCommand = new CloseFileCommandExecutor(fs);

	    System.out.println("-> EXECUTE COMMAND ");
		// Creating invoker and associating with Command
		FileInvoker file = new FileInvoker(openFileCommand);
		// perform action on invoker object
		file.execute();
		file = new FileInvoker(writeFileCommand);
		file.execute();
		file = new FileInvoker(closeFileCommand);
		file.execute();
		
		System.out.println("-> UNDO COMMAND ");
		file.undo();

	}

}
