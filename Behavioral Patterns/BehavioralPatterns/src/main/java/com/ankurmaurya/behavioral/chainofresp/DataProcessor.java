package com.ankurmaurya.behavioral.chainofresp;

public interface DataProcessor {

	boolean isValidData(String data);
	String processData(String data);
	
}
