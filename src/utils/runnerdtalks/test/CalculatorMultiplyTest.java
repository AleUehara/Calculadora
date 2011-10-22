package utils.runnerdtalks.test;

import junit.framework.TestCase;

import utils.runnerdtalks.BasicCalculator;


public class CalculatorMultiplyTest extends TestCase {
	private double firstIntegerFactor = 3;
	
	private double secondIntegerFactor = -5;
	
	private double zero = 0;
	
	private double decimalFactor = 1.1;
	
	public void testMultiply() {
		double result = BasicCalculator.multiply(firstIntegerFactor, secondIntegerFactor);
		
		assertTrue(result == -15);
	}

	public void testMultiplyPerZero() {
		double result = BasicCalculator.multiply(firstIntegerFactor, zero);
		
		assertTrue(result == 0);
	}

	public void testMultiplyPerDecimalNumber() {
		double result = BasicCalculator.multiply(firstIntegerFactor, decimalFactor);
		
		assertTrue(result == 3.3);
	}

	public void testMultiplyWithBigDecimalNumber() {
		double bigDecimalNumber = 1.0/3.0;
		
		double result = BasicCalculator.multiply(4, bigDecimalNumber);
		
		assertTrue(result == 1.33);
	}
}
