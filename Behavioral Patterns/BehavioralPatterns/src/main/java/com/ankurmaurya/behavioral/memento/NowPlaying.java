package com.ankurmaurya.behavioral.memento;

// Originator
public class NowPlaying {

	private String currentSong;

	public void play(String song) {
		this.currentSong = song;
	}

	public String getCurrentSong() {
		return currentSong;
	}

	public NowPlayingMemento save() {
		return new NowPlayingMemento(getCurrentSong());
	}

	public void previous(NowPlayingMemento nowPlayingMemento) {
		this.currentSong = nowPlayingMemento.getSong();
	}

	@Override
	public String toString() {
		return "Now playing : " + currentSong;
	}

	// Memento
	static class NowPlayingMemento {
		private String song;

		public NowPlayingMemento(String song) {
			this.song = song;
		}

		public String getSong() {
			return song;
		}
	}

}
