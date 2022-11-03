package com.ankurmaurya.behavioral.chainofresp;

public abstract class DataProcessorImpl implements DataProcessor {

	private final DataProcessor dataProcessor;

	public DataProcessorImpl(DataProcessor dataProcessor) {
		super();
		this.dataProcessor = dataProcessor;
	}

	public DataProcessor getDataProcessor() {
		return dataProcessor;
	}

}
