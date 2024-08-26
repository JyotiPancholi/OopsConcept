package oops.polymorphism.com;

public class OverloadingWithDifferentReturnTypes {
	int add(int a, int b)
	{
		return a + b;
	}
 
	double add(double a, double b)
	{
		return a + b;
	}
 
	public static void main(String[] args)
	{
		OverloadingWithDifferentReturnTypes math = new OverloadingWithDifferentReturnTypes();
		System.out.println("Sum of Two Integers : " + math.add(5, 3));
		System.out.println("Sum of Two Doubles : " + math.add(5.5, 3.3));
	}
}
