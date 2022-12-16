package com.ankurmaurya.solidprinciples.openclosed;

public class Commerce implements Stream {

	private final String name;

	public Commerce(String name) {
		super();
		this.name = name;
	}

	@Override
	public String streamName() {
		return this.name;
	}

}
