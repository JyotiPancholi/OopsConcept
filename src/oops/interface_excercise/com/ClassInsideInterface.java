package oops.interface_excercise.com;

interface MyInterface {
    class NestedClass {
        void display() {
            System.out.println("This is a method inside a nested class within an interface.");
        }
    }
}
public class ClassInsideInterface {

	public static void main(String[] args) {
		 MyInterface.NestedClass obj = new MyInterface.NestedClass();
	        obj.display();
	}
}
