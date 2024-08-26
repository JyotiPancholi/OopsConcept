package oops.polymorphism.com;

public class OverloadingDifferentParameterAndVarargs {
	void addItems(String... items)
	{
		System.out.println("Adding items to the shopping list :");
		for (String item : items)
		{
			System.out.println("- " + item);
		}
	}
 
	void addItems(int quantity, String... items)
	{
		System.out.println("Adding items with quantities to the shopping list :");
		for (String item : items)
		{
			System.out.println("- " + quantity + " " + item);
		}
	}
 
	public static void main(String[] args)
	{
		OverloadingDifferentParameterAndVarargs list = new OverloadingDifferentParameterAndVarargs();
		list.addItems("Milk", "Bread", "Eggs");
		list.addItems(5, "Apples", "Bananas");
		list.addItems('c', "Apples", "Bananas");

	}
}
