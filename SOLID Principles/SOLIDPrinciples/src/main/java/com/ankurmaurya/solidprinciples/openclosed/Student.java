package com.ankurmaurya.solidprinciples.openclosed;

public class Student {

	private final String name;
	private final String division;
	private final Stream stream;
	
	public Student(String name, String division, Stream stream) {
		super();
		this.name = name;
		this.division = division;
		this.stream = stream;
	}

	public String getName() {
		return name;
	}

	public String getDivision() {
		return division;
	}

	public Stream getStream() {
		return stream;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", division=" + division + ", stream=" + stream.streamName() + "]";
	}
	
	
	
	
	
	
}
