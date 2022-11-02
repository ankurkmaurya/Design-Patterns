package com.ankurmaurya.structural.decorator;

public class DataEncrypModifier extends DataModifier {

	public DataEncrypModifier(Writer writer) {
		super(writer);
	}

	@Override
	public void writeData(String data) {
		Writer w = this;
		
		if(this instanceof DataModifier) {
			
		}
		
		
		
		super.writeData(encryptData(data));
	}
	
	
	private String encryptData(String data) {
		return "Encrypted(" + data +")";
	}
	
}
