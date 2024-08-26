package oops.interface_excercise.com;

interface A {
//	   A() { }	
	void m1();
}

abstract class B implements A {
	public void m1() {
		System.out.println("One");
	}
}

public class InterfaceCantHaveConstructor {

	public static void main(String[] args) {

	}
}
