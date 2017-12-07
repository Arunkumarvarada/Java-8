package com.java4u.dp.command;

public class TurnOffCommand implements Command {
	private Light light;

	public TurnOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		this.light.turnOff();
	}
}
