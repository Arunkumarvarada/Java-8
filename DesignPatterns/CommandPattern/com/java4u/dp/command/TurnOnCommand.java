package com.java4u.dp.command;

public class TurnOnCommand implements Command {
	private Light light;

	public TurnOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		this.light.turnOn();
	}
}
