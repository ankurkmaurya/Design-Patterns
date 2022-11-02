package com.ankurmaurya.structural.decorator;

public class DataCompressModifier extends DataModifier {

	public DataCompressModifier(Writer writer) {
		super(writer);
	}

	@Override
	public void writeData(String data) {
		Writer w = this;
		super.writeData(compressData(data));
	}
	
	
	private String compressData(String data) {
		return "Compressed(" + data +")";
	}
	
	
}
