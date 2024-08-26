package oops.polymorphism.com;

class Animal {
	protected void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	@Override
	protected void makeSound() {
		System.out.println("Dog barks");
	}
}

public class NarrowsAccessModifier {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.makeSound();
	}
}
