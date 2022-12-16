package com.ankurmaurya.solidprinciples.singleresponsibility;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class BookPrinter {
	void printTextToConsole(String text) {
		System.out.println(text);
	}

	void printTextToFile(String filePath, String text) {
		Path fileP = Path.of(filePath);
		try {			
			Files.writeString(fileP, text, StandardOpenOption.APPEND);
		} catch (Exception e) {
			System.out.println("Exception - " + e.toString());
		}
	}

}
