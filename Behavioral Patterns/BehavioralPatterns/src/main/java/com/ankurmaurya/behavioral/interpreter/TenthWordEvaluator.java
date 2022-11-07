package com.ankurmaurya.behavioral.interpreter;

public class TenthWordEvaluator implements WordEvaluator {

	private int value;

	public int getValue() {
		return value;
	}

	@Override
	public int evaluate(String expression) {
		String leftExpression = "";
		String rightExpression = "";
		expression = expression.toLowerCase();
		if (expression.contains("ty")) {
			String[] expSpl = expression.split("\\s+");

			leftExpression = expSpl[0].trim();
			int leftExpNumber = EvaluatorUtil.convertTensWordToNumber(leftExpression);
			value = leftExpNumber;

			if (expSpl.length > 1) {
				rightExpression = expSpl[1].trim();
			}
		} else {
			rightExpression = expression;
		}

		if (!rightExpression.equals("")) {
			int rightExpNumber = new UnitWordEvaluator().evaluate(rightExpression);
			value += rightExpNumber;
		}

		return value;
	}

}
