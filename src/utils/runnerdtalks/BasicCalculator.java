package utils.runnerdtalks;

import java.math.BigDecimal;



public class BasicCalculator {
	
	public static double sum(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}
	
	public static double multiply (double firstFactor, double secondFactor){
		
		return round(firstFactor, secondFactor);
	}

	private static double round(double firstFactor, double secondFactor) {
		return BigDecimal.valueOf(firstFactor * secondFactor).setScale(2, BigDecimal.ROUND_HALF_EVEN).doubleValue();
	}
}
