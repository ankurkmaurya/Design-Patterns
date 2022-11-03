package com.ankurmaurya.behavioral.chainofresp;

public class SpecialCharDataProcessor extends DataProcessorImpl {

	@Override
	public boolean isValidData(String data) {
		return !data.matches(".*[//{//}//,//.//;].*");
	}

	@Override
	public String processData(String data) {
		String processedData = "";
		if (isValidData(data)) {
			processedData = data;
		} else {
			processedData = removeSpecialChar(data);
		}

		if (this.getDataProcessor() != null) {
			processedData = this.getDataProcessor().processData(processedData);
		}

		return processedData;
	}

	private String removeSpecialChar(String data) {
		String removedData = "";
		for (int i = 0; i < data.length(); i++) {
			switch (data.charAt(i)) {
			case '{':
			case '}':
			case ',':
			case '.':
			case ';':
				break;
			default:
				removedData = removedData + data.charAt(i);
			}
		}
		return removedData;
	}

}
