package oops.polymorphism.com;

interface Drawable {
	void draw();
}

abstract class Shape implements Drawable {
	@Override
	public void draw() {
		System.out.println("Drawing a shape");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}
}

public class OverrideFromAbstractClassAndInterface {
	 public static void main(String[] args)
		{
	        Circle circle = new Circle();
	        circle.draw();
	    }
}
