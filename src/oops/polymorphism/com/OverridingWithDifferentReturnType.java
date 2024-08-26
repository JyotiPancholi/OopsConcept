package oops.polymorphism.com;

class Superclass {
	public int getNumber() {
		return 10;
	}
}

class Subclass extends Superclass {
//	method overriding requires that the method signature, 
//	including the return type, must be the same or covariant
//	public double getNumber() {
//		return 20.5;
//	}
}

public class OverridingWithDifferentReturnType {
	public static void main(String[] args) {
		Superclass superObj = new Superclass();
		Subclass subObj = new Subclass();

		System.out.println("Superclass Number : " + superObj.getNumber());
		System.out.println("Subclass Number : " + subObj.getNumber());
	}
}
