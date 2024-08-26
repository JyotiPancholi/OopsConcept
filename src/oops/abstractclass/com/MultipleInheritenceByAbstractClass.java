package oops.abstractclass.com;

interface InterfaceA {
	void doSomething();
}

interface InterfaceB {
	void doSomething();
}

abstract class MyAbstractClass implements InterfaceA, InterfaceB {
	public void doSomething() {
		System.out.println("Doing something in MyAbstractClass.");
	}
}

class MyClass extends MyAbstractClass {
}

public class MultipleInheritenceByAbstractClass {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.doSomething();
	}

}
