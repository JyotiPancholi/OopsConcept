package oops.polymorphism.com;

class Animal1 {
	protected void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog1 extends Animal1 {
	@Override
	public void makeSound() {
		System.out.println("Dog barks");
	}
}

public class BroadensAccessModifierOverring {

	public static void main(String[] args) {
		Dog1 dog = new Dog1();
		dog.makeSound();
	}

}
