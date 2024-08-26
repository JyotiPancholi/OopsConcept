package oops.Inheritence;

class Hamm {
	 int a = 0;
	 int b = 1;
	 public void a() {
	 System.out.println("Ham " + a);
	 }
	 public void b() {
	 System.out.println("Ham " + b);
	 }
	 public String toString() {
	 return "Ham " + a + "  " + b;
	 }
	}

class Spamm extends Hamm {
	 int a = 2;
	 public void a() {
	 System.out.println("Spam " +a);
	 }
	}

class Yamm extends Spamm {
	 int b = 3;
	 public void a() {
	 System.out.println("Yam " + a);
	 }
	 public void b() {
	 System.out.println("Yam " + b);
	 }
	}
	
public class InheritenceEx {
	public static void main (String [] args){
	Hamm[] food = { new Spamm(), new Yamm(),
	 new Hamm()};
	for (int i = 0; i < food.length; i++) {
	 System.out.println(food[i]);
	 food[i].a();
	 food[i].b();

	System.out.println(food[i].a);

	System.out.println(food[i].b);
	 System.out.println();
	}
	} 
}
