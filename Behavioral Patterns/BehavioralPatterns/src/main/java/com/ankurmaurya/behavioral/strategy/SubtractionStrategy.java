package com.ankurmaurya.behavioral.strategy;

import java.util.function.IntBinaryOperator;

public class SubtractionStrategy implements StrategyI {

	@Override
	public int calculate(int a, int b) {
		IntBinaryOperator func = (x1, x2) -> x1 - x2;
		return func.applyAsInt(a, b);
	}

}
