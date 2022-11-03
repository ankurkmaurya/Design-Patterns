package com.ankurmaurya.behavioral.chainofresp;

/**
 * 
 * <h3>Chain of Responsibility Design Pattern</h3>
 * <p>
 * Chain of responsibility pattern is used to achieve loose coupling in software
 * design where a request from client is passed to a chain of objects to process
 * them. Then the object in the chain will decide themselves who will be
 * processing the request and whether the request is required to be sent to the
 * next object in the chain or not.
 * </p>
 * <p>
 * </p>
 * 
 * <h3>Structure :</h3>
 * <ol>
 * <li><b>Handler : </b>This can be an interface which will primarily receive
 * the request and dispatches the request to a chain of handlers. It has
 * reference to the only first handler in the chain and does not know anything
 * about the rest of the handlers.</li>
 * <li><b>Concrete Handlers : </b>These are actual handlers of the request
 * chained in some sequential order.</li>
 * <li><b>Client : </b>Originator of request and this will access the handler to
 * handle it.</li>
 * </ol>
 * 
 * 
 * <h3>Point :</h3>
 * <li>Client doesn’t know which part of the chain will be processing the
 * request and it will send the request to the first object in the chain.</li>
 * <li>Each object in the chain will have it’s own implementation to process the
 * request, either full or partial or to send it to the next object in the
 * chain.</li>
 * <li>Every object in the chain should have reference to the next object in
 * chain to forward the request to, its achieved by java composition.</li>
 * <li>Creating the chain carefully is very important otherwise there might be a
 * case that the request will never be forwarded to a particular processor or
 * there are no objects in the chain who are able to handle the request.</li>
 * <li>Chain of Responsibility design pattern is good to achieve lose coupling
 * but it comes with the trade-off of having a lot of implementation classes and
 * maintenance problems if most of the code is common in all the
 * implementations.</li>
 * <li>The Chain of Responsibility relies on transforming particular behaviors
 * into stand-alone objects called handlers. The pattern suggests that you link
 * these handlers into a chain. Each linked handler has a field for storing a
 * reference to the next handler in the chain. In addition to processing a
 * request, handlers pass the request further along the chain. The request
 * travels along the chain until all handlers have had a chance to process
 * it.</li>
 * <li>A handler can decide not to pass the request further down the chain and
 * effectively stop any further processing.</li>
 * 
 * 
 * <p>
 * <h3>Applicability : </h3>
 * <li>Use the Chain of Responsibility pattern when your program is expected to
 * process different kinds of requests in various ways, but the exact types of
 * requests and their sequences are unknown beforehand.
 * The pattern lets you link several handlers into one chain and, upon receiving
 * a request, “ask” each handler whether it can process it. This way all
 * handlers get a chance to process the request.</li>
 * <li>Use the pattern when it’s essential to execute several handlers in a
 * particular order.</li>
 * </p>
 * 
 * 
 * @author Ankur Maurya
 *
 */

public class ChainOfResponsibility {

	public static void main(String[] args) {
		String data = "4#A{7B5,6.7xC}Dj1;;;(:)";
		System.out.println("------ Chain Of Responsibility Pattern Implementation ------");
		NumericDataProcessor ucdp = new NumericDataProcessor(
				new UpperCaseDataProcessor(new SpecialCharDataProcessor(null)));
		String processedData = ucdp.processData(data);
		System.out.println(processedData);
	}

}
