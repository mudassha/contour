package SRP;

public class SrpTest {
	public static void main(String[] args)
	{
		Calculator c = new Calculator(3,4);
		CalculationPrinter cp = new CalculationPrinter(c);
		cp.print();
	}

}
