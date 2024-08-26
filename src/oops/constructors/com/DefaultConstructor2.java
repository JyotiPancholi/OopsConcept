package oops.constructors.com;

public class DefaultConstructor2 {
int id ;
String name;
void display() 
{
System.out.println(id+" "+name);	
}
	public static void main(String[] args) {
		DefaultConstructor2 d1 = new DefaultConstructor2();
		DefaultConstructor2 d2 = new DefaultConstructor2();
		d1.display();
		d2.display();
	}

}
