package com.ankurmaurya.behavioral.memento;

/**
 * 
 * <h3>Memento Design Pattern</h3>
 * <p>
 * The memento design pattern is used when we want to save the state of an
 * object so that we can restore later on. Memento pattern is used to implement
 * this in such a way that the saved state data of the object is not accessible
 * outside of the object, this protects the integrity of saved state data.
 * </p>
 * <p>
 * Memento pattern is implemented with two objects – <i>Originator</i> and
 * <i>Caretaker</i>. The originator is the object whose state needs to be saved
 * and restored and it uses an inner class to save the state of Object. The
 * inner class is called Memento and it’s private so that it can’t be accessed
 * from other objects.
 * </p>
 * 
 * 
 * <h3>Structure :</h3>
 * <ol>
 * <li><b>Originator -</b> The originator is the object that will be saving its state
 * for us to revert to later.</li>
 * <li><b>Caretaker -</b> This is the object that will save as well as restore the
 * state of the originator when each of these actions are required.</li>
 * <li><b>Memento -</b> The memento is the object that will be used by the caretaker to
 * store the state of the originator. The originator will write their state to
 * the memento when it is being saved, and read from it when the state is being
 * reverted.</li>
 * </ol>
 * 
 * 
 * <p>
 * <h3>Point :</h3>
 * <li>Memento Design Pattern will be used in situations where some actions are
 * undoable, therefore requiring to rollback to a previous state.</li>
 * <li>We can use Command and Memento together when implementing “undo”. In
 * this case, commands are responsible for performing various operations over a
 * target object, while mementos save the state of that object just before a
 * command gets executed.</li>
 * <li>You can use Memento along with Iterator to capture the current iteration
 * state and roll it back if necessary.</li>
 * <li>Memento stores internal state of the Originator object. The memento may
 * store as much or as little of the originator's internal state as necessary at
 * its originator's discretion.</li>
 * </p>
 * 
 *
 * 
 * @author Ankur Maurya
 * 
 */

public class Memento {

	public static void main(String[] args) {

		System.out.println("------ Memento Design Pattern Implementation ------");
		PlayedHistory history = new PlayedHistory();

		NowPlaying nowPlaying = new NowPlaying();
		nowPlaying.play("Sweet Child o' Mine");
		history.save(nowPlaying);
		System.out.println(nowPlaying);

		nowPlaying.play("Back In Black");
		history.save(nowPlaying);
		System.out.println(nowPlaying);

		nowPlaying.play("Cheap Thrills");
		history.save(nowPlaying);
		System.out.println(nowPlaying);

		nowPlaying.play("Shape of You");
		history.save(nowPlaying);
		System.out.println(nowPlaying);

		nowPlaying.play("Chaand Baliyan");
		history.save(nowPlaying);
		System.out.println(nowPlaying);

		// Going back to previous songs
		System.out.println();
		System.out.println("Playing Previous Songs.");
		history.previous(nowPlaying);
		System.out.println(nowPlaying);

		history.previous(nowPlaying);
		System.out.println(nowPlaying);

		history.previous(nowPlaying);
		System.out.println(nowPlaying);

		history.previous(nowPlaying);
		System.out.println(nowPlaying);
	}

}
