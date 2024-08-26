package oops.polymorphism.com;

public class OverloadingWithDifferentOrderofParameters {

	void show(int num, String message)
	{
		System.out.println("Number : " + num + ", Message : " + message);
	}
 
	void show(String message, int num)
	{
		System.out.println("Message : " + message + ", Number : " + num);
	}
 
	public static void main(String[] args)
	{
		OverloadingWithDifferentOrderofParameters display = new OverloadingWithDifferentOrderofParameters();
		display.show(7, "Java");
		display.show("Hello World", 10);
	}

}
