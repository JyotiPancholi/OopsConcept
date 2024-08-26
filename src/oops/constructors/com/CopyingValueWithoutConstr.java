package oops.constructors.com;

//Copying values without constructor
public class CopyingValueWithoutConstr {
	int id;
	String name;

	public CopyingValueWithoutConstr(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public CopyingValueWithoutConstr() {

	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		CopyingValueWithoutConstr c1 = new CopyingValueWithoutConstr(111, "jiya");
		CopyingValueWithoutConstr c2 = new CopyingValueWithoutConstr();
		c2.id = c1.id;
		c2.name = c1.name;
		c1.display();
		c2.display();

	}

}
