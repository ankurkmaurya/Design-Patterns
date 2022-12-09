package com.ankurmaurya.behavioral.memento;

import java.util.Stack;

//Caretaker
public class PlayedHistory {

	Stack<NowPlaying.NowPlayingMemento> history = new Stack<>();

	public void save(NowPlaying nowPlaying) {
		history.push(nowPlaying.save());
	}

	public void previous(NowPlaying nowPlaying) {
		if (!history.isEmpty()) {
			nowPlaying.previous(history.pop());
		} else {
			System.out.println("End of played history.");
		}
	}

}
