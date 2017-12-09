package com.java4u.dp.chainofresponsibilty.test;

import com.java4u.dp.chainofresponsibilty.AbstractLogger;
import com.java4u.dp.chainofresponsibilty.ConsoleLogger;
import com.java4u.dp.chainofresponsibilty.ErrorLogger;
import com.java4u.dp.chainofresponsibilty.FileLogger;

public class TestChainOfResponisbiltyPattern {

	private static AbstractLogger getChainOfLogger() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		return errorLogger;
	}

	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLogger();
		loggerChain.logMessage(AbstractLogger.INFO, "This is an information ");
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is a Debug level infromation");
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an Error level infromation");

	}

}
