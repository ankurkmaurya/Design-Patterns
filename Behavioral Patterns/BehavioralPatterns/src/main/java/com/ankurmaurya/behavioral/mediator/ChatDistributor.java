package com.ankurmaurya.behavioral.mediator;

public interface ChatDistributor {
    void sendMessage(String msg, User user);
	void addUser(User user);
}
