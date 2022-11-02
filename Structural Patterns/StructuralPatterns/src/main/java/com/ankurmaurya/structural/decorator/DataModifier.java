package com.ankurmaurya.structural.decorator;

public abstract class DataModifier implements Writer {
   
	private final Writer writer;

	public DataModifier(Writer writer) {
		super();
		this.writer = writer;
	}

	@Override
	public void writeData(String data) {
		Writer w = this;
		this.writer.writeData(data);
	}

}
