package oops.polymorphism.com;

public class OverloadingWithDifferentAccessModifiers {

	void draw() {
		System.out.println("Drawing shape");
	}

	public void draw(String shapeName) {
		System.out.println("Drawing " + shapeName);
	}

	protected void draw(int sides) {
		System.out.println("Drawing a shape with " + sides + " sides");
	}

	private void draw(double area) {
		System.out.println("Drawing a shape with area " + area);
	}

	public static void main(String[] args) {
		OverloadingWithDifferentAccessModifiers shape = new OverloadingWithDifferentAccessModifiers();
		shape.draw();
		shape.draw("Circle");
		shape.draw(4);
		shape.draw(25.0);
	}
}
