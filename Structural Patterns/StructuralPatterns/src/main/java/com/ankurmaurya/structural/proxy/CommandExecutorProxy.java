package com.ankurmaurya.structural.proxy;

public class CommandExecutorProxy implements CommandExecutor {

	private boolean isAdmin;
	CommandExecutor cmdExecutor;

	public CommandExecutorProxy(String userName, String password) {
		if (userName.equals("admin") && password.equals("ABCD1234")) {
			isAdmin = true;
		}
		this.cmdExecutor = new CommandExecutorImpl();
	}

	@Override
	public void runCommand(String cmd) throws Exception {
		if (isAdmin) {
			cmdExecutor.runCommand(cmd);
		} else {
			if (cmd.trim().startsWith("rm")) {
				throw new Exception("rm command is not allowed for non-admin users.");
			} else if (cmd.trim().startsWith("systeminfo")) {
				throw new Exception("systeminfo command is not allowed for non-admin users.");
			} else {
				cmdExecutor.runCommand(cmd);
			}
		}

	}

}
