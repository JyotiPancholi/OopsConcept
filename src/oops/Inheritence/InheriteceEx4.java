package oops.Inheritence;

class Ay {
	protected int x = 1;

	protected void setX(int a) {
		x = a;
	}

	protected int getX() {
		return x;
	}
}

class By extends Ay {
	protected int x = 3;

	public int getX() {
		return x;
	}

	public int getB() {
		return x;
	}
}

public class InheriteceEx4 {

	public static void main(String[] args) {
		Ay a = new Ay();
		By b = new By();
		System.out.println(a.getX());
		System.out.println(b.getB());
		System.out.println(b.getX());
		System.out.println(a.x);
		System.out.println(b.x);

	}

}
