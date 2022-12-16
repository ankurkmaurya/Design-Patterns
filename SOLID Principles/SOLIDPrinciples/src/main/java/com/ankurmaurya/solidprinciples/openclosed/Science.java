package com.ankurmaurya.solidprinciples.openclosed;

public class Science implements Stream {

	private final String name;
	

	public Science(String name) {
		super();
		this.name = name;
	}

	@Override
	public String streamName() {
		return this.name;
	}

}
