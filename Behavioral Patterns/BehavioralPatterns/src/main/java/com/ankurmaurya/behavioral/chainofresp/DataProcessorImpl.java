package com.ankurmaurya.behavioral.chainofresp;

public abstract class DataProcessorImpl implements DataProcessor {

	private DataProcessor dataProcessor;
	
	public void setNext(DataProcessor dataProcessor) {
		this.dataProcessor = dataProcessor;
	}

	public DataProcessor getDataProcessor() {
		return dataProcessor;
	}

}
