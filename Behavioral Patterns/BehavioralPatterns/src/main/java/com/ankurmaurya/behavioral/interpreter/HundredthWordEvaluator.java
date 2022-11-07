package com.ankurmaurya.behavioral.interpreter;

public class HundredthWordEvaluator implements WordEvaluator {

	private int value;

	public int getValue() {
		return value;
	}

	@Override
	public int evaluate(String expression) {
		String leftExpression = "";
		String rightExpression = "";
		expression = expression.toLowerCase();
		if (expression.contains("hundred")) {
			String[] expSpl = expression.split("hundred");
			leftExpression = expSpl[0].trim();
			int leftExpNumber = new TenthWordEvaluator().evaluate(leftExpression);
			value = leftExpNumber * 100;

			if (expSpl.length > 1) {
				rightExpression = expSpl[1].trim();
			}
		} else {
			rightExpression = expression;
		}

		if (!rightExpression.equals("")) {
			int rightExpNumber = new TenthWordEvaluator().evaluate(rightExpression);
			value += rightExpNumber;
		}

		return value;
	}

}
