package com.ankurmaurya.behavioral.mediator;

public class UserImpl extends User {

	public UserImpl(ChatDistributor distributor, String name) {
		super(distributor, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name + " : Sending Message -> " + msg);
		distributor.sendMessage(msg, this);

	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name + " : Received Message <- " + msg);
	}

}
