package oops.polymorphism.com;

class Box<T> {
	T item;

	Box(T item) {
		this.item = item;
	}

	void display() {
		System.out.println("Item : " + item);
	}
}

class StringBox extends Box<String> {
	StringBox(String item) {
		super(item);
	}

	@Override
	void display() {
		super.display();
		System.out.println("Length : " + item.length());
	}
}

public class OverridesGenericClassMethod {
	public static void main(String[] args)
	{
        StringBox box = new StringBox("Java Exercise");
        box.display();
    }
}
