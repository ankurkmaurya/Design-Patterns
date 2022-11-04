package com.ankurmaurya.behavioral.command;

public class CloseFileCommandExecutor implements CommandExecutor {

	private final FileSystemReceiver fileSystem;

	public CloseFileCommandExecutor(FileSystemReceiver fileSystem) {
		super();
		this.fileSystem = fileSystem;
	}

	@Override
	public void execute() {
		this.fileSystem.closeFile();
	}

}
