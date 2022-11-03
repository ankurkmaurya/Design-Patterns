package com.ankurmaurya.behavioral.chainofresp;

public class UpperCaseDataProcessor extends DataProcessorImpl {

	public UpperCaseDataProcessor(DataProcessor dataProcessor) {
		super(dataProcessor);
	}

	@Override
	public boolean isValidData(String data) {
		return !data.matches(".*[a-z].*");
	}

	@Override
	public String processData(String data) {
		String processedData = "";
		if (isValidData(data)) {
			processedData = data;
		}else {
			processedData = data.toUpperCase();
		}

		if (this.getDataProcessor() != null) {
			processedData = this.getDataProcessor().processData(processedData);
		}

		return processedData;
	}

}
