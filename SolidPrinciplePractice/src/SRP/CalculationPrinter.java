package SRP;

public class CalculationPrinter {
	Calculator c1;
	
	public CalculationPrinter(Calculator c1) {
		this.c1 = c1;
	}
	
	public void print()
	{
		System.out.println("Sum : " +c1.sum());
	}
}
