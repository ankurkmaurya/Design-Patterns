package com.ankurmaurya.behavioral.strategy;

import java.util.function.IntBinaryOperator;

public class StrategyIIImpl implements StrategyII {

	private final int value1;
	private final int value2;
	
	
	public StrategyIIImpl(int value1, int value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
	}

	@Override
	public int calculate(IntBinaryOperator func) {
		return func.applyAsInt(value1, value2);
	}

}
