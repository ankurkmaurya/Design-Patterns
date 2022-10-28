package com.ankurmaurya.prototype;

public class Album implements PrototypeCapable {
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
	public Album clone() throws CloneNotSupportedException {
		System.out.println("Cloning Album object..");
		return (Album) super.clone();
	}

	@Override
	public String toString() {
		return "Album : " + getName();
	}

}
