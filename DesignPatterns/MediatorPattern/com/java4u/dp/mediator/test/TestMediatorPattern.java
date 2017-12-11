package com.java4u.dp.mediator.test;

import com.java4u.dp.mediator.User;

public class TestMediatorPattern {

	public static void main(String[] args) {
		User robert = new User("Robert");
		User john = new User("John");
		robert.sendChatMessage("Hi!! John");
		john.sendChatMessage("Hello! Robert");

	}

}
