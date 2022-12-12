package com.ankurmaurya.behavioral.strategy;

public class Context {

	private StrategyI strategyI;  
    
    public Context(StrategyI strategyI){  
       this.strategyI = strategyI;  
    }  

    public int executeStrategy(int num1, int num2){  
       return strategyI.calculate(num1, num2); 
    }  
	
}
