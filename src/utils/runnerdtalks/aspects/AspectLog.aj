package utils.runnerdtalks.aspects;


public aspect AspectLog {
	
	
	pointcut calculatorPointCut(double firstValue, double secondValue) : call(* utils.runnerdtalks.BasicCalculator.*(double, double)) && args(firstValue, secondValue);
	
	after (double firstValue, double secondValue) returning(double returned) : calculatorPointCut(firstValue, secondValue) {
		System.out.println("Method: " +thisJoinPoint.getSignature().getName() + " - FirstValue:"+firstValue +" SecondValue:"+ secondValue +" Result:"+returned);
	}
	
}

