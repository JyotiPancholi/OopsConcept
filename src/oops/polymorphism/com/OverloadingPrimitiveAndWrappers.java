package oops.polymorphism.com;

public class OverloadingPrimitiveAndWrappers {

	void display(int num)
	{
		System.out.println("Primitive int : " + num);
	}
 
	void display(Integer num)
	{
		System.out.println("Wrapper Integer : " + num);
	}
 
	public static void main(String[] args)
	{
		OverloadingPrimitiveAndWrappers data = new OverloadingPrimitiveAndWrappers();
		int primitiveInt = 47;
		Integer wrapperInt = 47;
		data.display(primitiveInt);
		data.display(wrapperInt);
	}

}
