package utils.runnerdtalks.test;

import junit.framework.TestCase;

import utils.runnerdtalks.BasicCalculator;


public class CalculatorSumTest extends TestCase {
	
	private static final double secondDecimalNumber = 0.5;
	private static final double firstDecimalNumber = 1.1;
	private static final double firstNumber = 1;
	private static final double secondNumber = 2;
	
	public void testSoma(){
		double result = BasicCalculator.sum(firstNumber, secondNumber);
		assertTrue(result == 3);
	}

	public void testSomaSegundoNumeroNegativo() {
		double result = BasicCalculator.sum(firstNumber, -secondNumber);
		assertTrue(result == -1);
	}
	
	public void testSomaNumeroDecimal() {
		double result = BasicCalculator.sum(firstDecimalNumber, secondDecimalNumber);
		assertTrue(result == 1.6);
	}
	
}
