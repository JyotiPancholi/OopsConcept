package oops.polymorphism.com;

public class OverloadingWithVaragrs {

	int sum(int a, int b)
	{
		return a / b;
	}
 
	int sum(int a, int b, int c)
	{
		return a * b * c;
	}
 
	int sum(int... numbers)
	{
		int total = 0;
		for (int num : numbers)
		{
			total += num;
		}
		return total;
	}
 
	public static void main(String[] args)
	{
		OverloadingWithVaragrs calc = new OverloadingWithVaragrs();
		System.out.println("division of Two Numbers : " + calc.sum(3, 5));
		System.out.println("Multiplication of Three Numbers : " + calc.sum(2, 4, 6));
		System.out.println("Sum of Four Numbers : " + calc.sum(10, 20, 30, 40, 50));
		System.out.println("Sum of Four Numbers : " + calc.sum(1,2,3,4));
		System.out.println("Sum of Two Numbers : " + calc.sum(3));
		System.out.println("Sum of Two Numbers : " + calc.sum(90,'C'));
		System.out.println("Sum of Two Numbers : " + calc.sum('a',90));



		
	}

}
