package com.java4u.lambda;

public class Greeter {
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();

		Greeting lambdaGreeting = () -> System.out.print("Hello world!");

		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Hello world!");
			}
			
		};

		greeter.greet(() -> System.out.println("Hello world!"));
		greeter.greet(innerClassGreeting);

	}
}
