package com.ankurmaurya.creational.prototype;

public class Show implements PrototypeCapable {
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
	public Show clone() throws CloneNotSupportedException {
		System.out.println("Cloning Show object..");
		return (Show) super.clone();
	}

	@Override
	public String toString() {
		return "Show : " + getName();
	}
}
