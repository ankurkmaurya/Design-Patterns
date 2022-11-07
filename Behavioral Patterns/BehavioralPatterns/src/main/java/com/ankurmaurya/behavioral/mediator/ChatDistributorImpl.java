package com.ankurmaurya.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatDistributorImpl implements ChatDistributor {

	private List<User> users;

	public ChatDistributorImpl() {
		this.users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String msg, User sendingUser) {
		if(!users.contains(sendingUser)) {
			System.out.println(sendingUser.name + ", you are not added to this group!");
			return;
		}

		for(User user  : this.users){
			//message should not be received by the user sending it
			if(user != sendingUser){
				user.receive(msg);
			}
		}
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

}
