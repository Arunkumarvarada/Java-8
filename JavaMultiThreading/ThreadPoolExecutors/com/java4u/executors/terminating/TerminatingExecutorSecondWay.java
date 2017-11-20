package com.java4u.executors.terminating;

public class TerminatingExecutorSecondWay {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();

		System.out.println("[" + currentThreadName + "] Main thread starts here");
		
		
		System.out.println("[" + currentThreadName + "] Main thread ends here");
	}

}
