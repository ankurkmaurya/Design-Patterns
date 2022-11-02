package com.ankurmaurya.structural.decorator;

public class StreamWriter implements Writer {

	@Override
	public void writeData(String data) {
		System.out.println("Writing to Stream -> ");
		System.out.println(data);
	}

}
