package com.ankurmaurya.behavioral.command;

public class OpenFileCommandExecutor implements CommandExecutor {

	private final FileSystemReceiver fileSystem;

	public OpenFileCommandExecutor(FileSystemReceiver fileSystem) {
		super();
		this.fileSystem = fileSystem;
	}

	@Override
	public void execute() {
		this.fileSystem.openFile();
	}

}
