package oops.abstractclass.com;

public class AbstractMethodAsStatic {

//	abstract class Vehicle {
//	    abstract static void accelerate(); // This line will cause an error
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//error: illegal combination of modifiers: abstract and static

//------------------------Reason-----------------------------------------------
//This is because abstract methods are designed to be overridden by subclasses, 
//and static methods are not subject to overriding.