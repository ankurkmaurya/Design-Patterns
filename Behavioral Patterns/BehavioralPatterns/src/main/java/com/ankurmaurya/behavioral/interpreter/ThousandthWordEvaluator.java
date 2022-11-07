package com.ankurmaurya.behavioral.interpreter;

public class ThousandthWordEvaluator implements WordEvaluator {

	private int value;

	public int getValue() {
		return value;
	}

	@Override
	public int evaluate(String expression) {
		String leftExpression = "";
		String rightExpression = "";
		expression = expression.toLowerCase();
		if (expression.contains("thousand")) {
			String[] expSpl = expression.split("thousand");
			leftExpression = expSpl[0].trim();
			int leftExpNumber = new TenthWordEvaluator().evaluate(leftExpression);
			value = leftExpNumber * 1000;

			if (expSpl.length > 1) {
				rightExpression = expSpl[1].trim();
			}
		} else {
			rightExpression = expression;
		}

		if (!rightExpression.equals("")) {
			int rightExpNumber = new HundredthWordEvaluator().evaluate(rightExpression);
			value += rightExpNumber;
		}

		return value;
	}

}
