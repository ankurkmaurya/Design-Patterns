package com.ankurmaurya.structural.decorator;

public class FileWriter implements Writer {

	@Override
	public void writeData(String data) {
		System.out.println("Writing to File -> ");
		System.out.println(data);
	}

}
