package com.ankurmaurya.solidprinciples.openclosed;

public class Arts implements Stream {

	private final String name;

	public Arts(String name) {
		super();
		this.name = name;
	}

	@Override
	public String streamName() {
		return this.name;
	}

}
