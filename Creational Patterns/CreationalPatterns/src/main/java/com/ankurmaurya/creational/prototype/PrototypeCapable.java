package com.ankurmaurya.creational.prototype;

public interface PrototypeCapable extends Cloneable {
	
	public PrototypeCapable initName(String name);
	public PrototypeCapable clone() throws CloneNotSupportedException;
}
