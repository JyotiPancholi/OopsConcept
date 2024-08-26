package oops.abstractclass.com;

public class AbstractMethodCanNotBePrivate {

//	abstract class Vehicle {
//	    private abstract void accelerate(); // This line will cause an error
//	}
	
//	error: illegal combination of modifiers: private and abstract

	public static void main(String[] args) {

	}
}


//An abstract method cannot be declared as private because abstract methods are intended to 
//be overridden by subclasses, while private methods are not visible to subclasses.