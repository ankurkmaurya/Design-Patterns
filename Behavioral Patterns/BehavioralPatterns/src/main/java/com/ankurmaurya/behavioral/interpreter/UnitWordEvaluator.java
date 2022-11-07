package com.ankurmaurya.behavioral.interpreter;

public class UnitWordEvaluator implements WordEvaluator {
	private int value;
	
	@Override
	public int evaluate(String expression) {
		value = EvaluatorUtil.convertUnitWordToNumber(expression);
		return value;
	}

	public int getValue() {
		return value;
	}
	
	

}
