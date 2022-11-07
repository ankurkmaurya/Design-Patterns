package com.ankurmaurya.behavioral.mediator;

public abstract class User {
	protected ChatDistributor distributor;
	protected String name;

	public User(ChatDistributor distributor, String name) {
		this.distributor = distributor;
		this.name = name;
	}

	public abstract void send(String msg);

	public abstract void receive(String msg);
}
