package oops.Inheritence;

class Dogs extends DomesticAnimal {
	void bark() {
		System.out.println("barking . . !");
	}
}

class BabyDog extends Dogs {
	void weep() {
		System.out.println("weeping  . .!");
	}
}

public class DomesticAnimal {
	void eat() {
		System.out.println("Eating . . !");
	}

	public static void main(String[] args) {
		BabyDog bd = new BabyDog();
		bd.eat();
		bd.bark();
		bd.weep();
	}
}
