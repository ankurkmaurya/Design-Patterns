package com.ankurmaurya.behavioral.command;

public class FileSystemReceiverUtil {
	
	public static FileSystemReceiver getUnderlyingFileSystem() {
		String osName = System.getProperty("os.name");
		System.out.println("Underlying OS is:" + osName);
		if (osName.contains("Windows")) {
			return new WindowsFileSystemReceiver();
		} else {
			return new LinuxFileSystemReceiver();
		}
	}
	
}