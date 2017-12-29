package com.java4u.lambda;

public class RunnableExample {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Printed inside the run method!!");

			}

		});

		thread.run();
		Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside the Lambda Expression"));
		myLambdaThread.run();
	}

}
