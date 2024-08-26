package oops.constructors.com;

public class ParameterizedConstructor {
int id;
String name;

public ParameterizedConstructor(int i, String n) {
	this.id = i;
	this.name = n;
}
void display() 
{
System.out.println(id+" "+name);	
}
	public static void main(String[] args) {
		ParameterizedConstructor pc1 = new ParameterizedConstructor(111, "jiya");
		ParameterizedConstructor pc2 = new ParameterizedConstructor(222, "jyoti");
		pc1.display();
		pc2.display();
	}

}
