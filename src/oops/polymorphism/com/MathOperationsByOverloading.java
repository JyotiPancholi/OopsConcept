package oops.polymorphism.com;

public class MathOperationsByOverloading {
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		MathOperationsByOverloading math = new MathOperationsByOverloading();
		System.out.println("Sum of Two Numbers : " + math.add(7, 3));
		System.out.println("Sum of Three Numbers : " + math.add(5, 9, 3));
	}
}
