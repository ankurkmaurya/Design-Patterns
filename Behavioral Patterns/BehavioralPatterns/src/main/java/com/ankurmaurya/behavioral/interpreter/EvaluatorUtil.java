package com.ankurmaurya.behavioral.interpreter;

public class EvaluatorUtil {

	private EvaluatorUtil() {
	}

	public static int convertUnitWordToNumber(String word) {
		int number = 0;
		switch (word.toLowerCase().trim()) {
		case "one":
			number = 1;
			break;
		case "two":
			number = 2;
			break;
		case "three":
			number = 3;
			break;
		case "four":
			number = 4;
			break;
		case "five":
			number = 5;
			break;
		case "six":
			number = 6;
			break;
		case "seven":
			number = 7;
			break;
		case "eight":
			number = 8;
			break;
		case "nine":
			number = 9;
			break;
		case "ten":
			number = 10;
			break;
		case "eleven":
			number = 11;
			break;
		case "twelve":
			number = 12;
			break;
		case "thirteen":
			number = 13;
			break;
		case "fourteen":
			number = 14;
			break;
		case "fifteen":
			number = 15;
			break;
		case "sixteen":
			number = 16;
			break;
		case "seventeen":
			number = 17;
			break;
		case "eighteen":
			number = 18;
			break;
		case "nineteen":
			number = 19;
			break;
		default:
			number = -1;
			break;
		}
		return number;
	}

	public static int convertTensWordToNumber(String word) {
		int number = 0;
		switch (word.toLowerCase().trim()) {
		case "twenty":
			number = 20;
			break;
		case "thirty":
			number = 30;
			break;
		case "forty":
			number = 40;
			break;
		case "fifty":
			number = 50;
			break;
		case "sixty":
			number = 60;
			break;
		case "seventy":
			number = 70;
			break;
		case "eighty":
			number = 80;
			break;
		case "ninety":
			number = 90;
			break;
		default:
			number = -1;
			break;
		}
		return number;
	}

	public static int evaluateNumericWords(String expression) {
		int number = 0;
		expression = expression.toLowerCase();
		if (expression.contains("thousand")) {
			number = new ThousandthWordEvaluator().evaluate(expression);
		} else if (expression.contains("hundred")) {
			number = new HundredthWordEvaluator().evaluate(expression);
		} else if (expression.contains("ty")) {
			number = new TenthWordEvaluator().evaluate(expression);
		} else {
			number = new UnitWordEvaluator().evaluate(expression);
		}
		return number;
	}

}
