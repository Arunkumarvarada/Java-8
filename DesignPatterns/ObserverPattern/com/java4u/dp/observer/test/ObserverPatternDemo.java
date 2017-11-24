package com.java4u.dp.observer.test;

import com.java4u.dp.observer.interfaces.MyTopic;
import com.java4u.dp.observer.interfaces.MyTopicSubscriber;
import com.java4u.dp.observer.interfaces.Observer;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		MyTopic topic = new MyTopic();

		Observer Obj1 = new MyTopicSubscriber("Observer1");
		Observer Obj2 = new MyTopicSubscriber("Observer2");
		Observer Obj3 = new MyTopicSubscriber("Observer3");

		topic.register(Obj1);
		topic.register(Obj2);
		topic.register(Obj3);

		Obj1.setSubject(topic);
		Obj2.setSubject(topic);
		Obj3.setSubject(topic);

		Obj1.update();
		topic.postMessage("New message");

	}

}
