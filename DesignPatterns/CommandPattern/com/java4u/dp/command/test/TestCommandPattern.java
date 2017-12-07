package com.java4u.dp.command.test;

import com.java4u.dp.command.Light;
import com.java4u.dp.command.Switcher;
import com.java4u.dp.command.TurnOffCommand;
import com.java4u.dp.command.TurnOnCommand;

public class TestCommandPattern {

	public static void main(String[] args) {
		Switcher switcher = new Switcher();

		Light light = new Light();
		TurnOnCommand turnOnCommand = new TurnOnCommand(light);
		TurnOffCommand turnOffCommand = new TurnOffCommand(light);

		switcher.addComand(turnOffCommand);
		switcher.addComand(turnOnCommand);

		switcher.executeCommmands();

	}

}
