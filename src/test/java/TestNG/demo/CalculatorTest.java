package TestNG.demo;

import org.testng.annotations.Test;

public class CalculatorTest {
	@Test
	public void addNumbers() {
		int a=3, b=5;
		System.out.println("Addition : "+(a+b));
	}
	@Test
	public void subtractNumbers()
	{
		int a=10,b=4;
		System.out.println("subtraction :" +(a-b));
	}
	@Test
	public void multiplyNumbers()
	{
		int a=10,b=5;
		System.out.println("Multiply : " +(a*b));
	}
}
