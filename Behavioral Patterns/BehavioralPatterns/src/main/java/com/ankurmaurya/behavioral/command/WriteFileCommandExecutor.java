package com.ankurmaurya.behavioral.command;

public class WriteFileCommandExecutor implements CommandExecutor {
	
	private final FileSystemReceiver fileSystem;

	public WriteFileCommandExecutor(FileSystemReceiver fileSystem) {
		super();
		this.fileSystem = fileSystem;
	}

	@Override
	public void execute() {
		this.fileSystem.writeFile();
	}

}
