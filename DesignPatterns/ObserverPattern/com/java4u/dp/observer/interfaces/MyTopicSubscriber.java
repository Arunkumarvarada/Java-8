package com.java4u.dp.observer.interfaces;

public class MyTopicSubscriber implements Observer {
	private String name;
	private Subject topic;

	public MyTopicSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		String msg = (String) topic.getUpdate();
		if (msg == null) {
			System.out.println(name + " :: No new Messages!!");
		} else {
			System.out.println(name + " :: Consuming the message ::" + msg);
		}
	}

	@Override
	public void setSubject(Subject subject) {
		this.topic = subject;
	}

}
