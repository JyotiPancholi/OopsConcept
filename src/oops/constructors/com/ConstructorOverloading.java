package oops.constructors.com;

public class ConstructorOverloading {
	int id;
	String name;
	int age;
	
	public ConstructorOverloading(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public ConstructorOverloading(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	void display() {
	System.out.println(id+"  "+name+"  "+age);
	}
public static void main(String[] args) {
	ConstructorOverloading s1 =  new ConstructorOverloading(234, "jiya");
	ConstructorOverloading s2 =  new ConstructorOverloading(345, "jyoti", 25);
	s1.display();
	s2.display();
	}
}
