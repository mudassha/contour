package SRP;

public class CalculatorSubtraction extends Calculator {

	public CalculatorSubtraction(int a, int b) {
		super(a, b);
	}
	
	
	public int subtract()
	{
		return super.getA()-super.getB();
	}
}
