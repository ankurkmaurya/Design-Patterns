package com.ankurmaurya.prototype;

public class Movie implements PrototypeCapable {
	private String name = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public PrototypeCapable initName(String name) {
		setName(name);
		return this;
	}

	@Override
	public Movie clone() throws CloneNotSupportedException {
		System.out.println("Cloning Movie object..");
		return (Movie) super.clone();
	}

	@Override
	public String toString() {
		return "Movie : " + getName();
	}
	
}
