package com.ankurmaurya.behavioral.command;

import java.util.Stack;

public class FileInvoker {

	public final CommandExecutor commandExecutor;
	public static final Stack<CommandExecutor> commandHistory = new Stack<>();
	
	public FileInvoker(CommandExecutor c) {
		this.commandExecutor = c;
	}

	public void execute() {
		commandHistory.push(commandExecutor);
		this.commandExecutor.execute();
	}
	
	public void undo() {
		while(!commandHistory.isEmpty()) {
			commandHistory.pop().execute();
		}
	}

}
