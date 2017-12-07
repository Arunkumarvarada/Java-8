package com.java4u.dp.command;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
	List<Command> commands;

	public Switcher() {
		this.commands = new ArrayList<Command>();
	}

	public void addComand(Command command) {
		this.commands.add(command);
	}

	public void executeCommmands() {
		for (Command command : this.commands) {
			command.execute();
		}
	}
}
