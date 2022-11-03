package com.ankurmaurya.behavioral.chainofresp;


public class NumericDataProcessor extends DataProcessorImpl {


	@Override
	public boolean isValidData(String data) {
		return !data.matches(".*[0-9].*");
	}

	@Override
	public String processData(String data) {
		String processedData = "";
		if (isValidData(data)) {
			processedData = data;
		}else {
			processedData = removeNumericValues(data);
		}

		if (this.getDataProcessor() != null) {
			processedData = this.getDataProcessor().processData(processedData);
		}

		return processedData;
	}

	private String removeNumericValues(String data) {
		String removedData = "";
		for(int i=0; i< data.length(); i++) {
			if(!Character.isDigit(data.charAt(i))){
				removedData = removedData + data.charAt(i);
			}
		}
		return removedData;
	}
	
}
