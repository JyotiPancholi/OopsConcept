package oops.constructors.com;

//There is no copy constructor in Java. However, we can copy the values from one object to another like copy constructor in C++.
//
//There are many ways to copy the values of one object into another in Java. They are:
//
//By constructor
//By assigning the values of one object into another
//By clone() method of Object class

public class NoCopyConstructor {
int id;
String name;

	public NoCopyConstructor(int id, String name) {
	this.id = id;
	this.name = name;
    }
	

	public NoCopyConstructor(NoCopyConstructor c) {
	id = c.id;
	name = c.name;
	}
void display()
	 {
		 System.out.println(id+" "+name);
	 } 

	public static void main(String[] args) {
//In this example, we are going to copy the values of one object into another using Java constructor.
		NoCopyConstructor s1 = new NoCopyConstructor(111, "jiya");
		NoCopyConstructor s2 = new NoCopyConstructor(s1);
		s1.display();
		s2.display();
	}

}
