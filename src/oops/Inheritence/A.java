package oops.Inheritence;

//multiple  inharitence not allowed ,,,hence giving complile time error
public class A {
	int i = 1212;

	public static void main(String[] args) {
		A a = new A();

		B b = new B(a);

		System.out.println(a.i);

		System.out.println(b.i);

		System.out.println(b.a.i);

		b.a.i = 2121;

		System.out.println("--------");

		System.out.println(a.i);

		System.out.println(b.i);
	}
}

class B extends A {
	A a;

	public B(A a) {
		this.a = a;
	}
}
