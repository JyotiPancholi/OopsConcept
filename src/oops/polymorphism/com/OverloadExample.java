package oops.polymorphism.com;

class OverloadExample
{
	void print(int num)
	{
		System.out.println("Integer : " + num);
	}
 
	void print(double num)
	{
		System.out.println("Double : " + num);
	}
 
	public static void main(String[] args)
	{
		OverloadExample obj = new OverloadExample();
		obj.print(18);
		obj.print(84.44);
	}
}