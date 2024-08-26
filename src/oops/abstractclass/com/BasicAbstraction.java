package oops.abstractclass.com;

abstract class Animal {
	public abstract void sound();
}
class Lion extends Animal {
    @Override
    public void sound() {
        System.out.println("Lion roars!");
    }
} 
class Tiger extends Animal {
    @Override
    public void sound() {
        System.out.println("Tiger growls!");
    }
} 

public class BasicAbstraction {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.sound();
        Animal tiger = new Tiger();
        tiger.sound();
    }
}