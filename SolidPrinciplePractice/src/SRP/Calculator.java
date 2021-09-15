package SRP;

public class Calculator {
	
	private int a;
	private int b;
	
	public Calculator(int a, int b){
		
		this.a = a;
		this.b = b;
	}
	
	
	public int sum()
	{
		return a+b;
	}
	public void setA(int a)
	{
		this.a = a;
	}
	public int getA() {
		return a;
	}
	
	public void setB(int b)
	{
		this.b= b;
	}
	public int getB() {
		return b;
	}
}
