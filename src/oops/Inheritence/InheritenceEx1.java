package oops.Inheritence;

public class InheritenceEx1 {
	 private String x = "Ax";
	 protected String y = "Ay";
	 public String z = "Az";
	 public String toString() {
	 return x + y + z; 
	 }
	public static void main(String[] args) {
		InheritenceEx1 i = new InheritenceEx1();
		System.out.println(i);
	}
}
//--------------------------------------
class TestB extends InheritenceEx1
{
 private String x = "Bx";
public String z = "Bz";
public String toString() {
 return x + y + z;
 }
 public static void main(String [] args)
 {
	 TestB b = new TestB();
 System.out.println(b);
 }
} 
//-------------------------------------
class TestC extends InheritenceEx1
{
private String x = "Cx";
 public static void main(
 String [] args)
 {
	 TestC c = new TestC();
 System.out.println(c.x);
 System.out.println(c);
 }
} 
//-------------------------------------
class TestD extends TestC
{
 private String x = "Dx";
 public String z = "Dz";
public static void main(
 String [] args)
 {
TestD d = new TestD();
System.out.println(d.x);
 System.out.println(d.y);
 System.out.println(d.z);
 System.out.println(d);

 TestC c = new TestD();
// Error: System.out.println(c.x);
 System.out.println(c.y);
 System.out.println(c.z);
 System.out.println(c);
 }
} 
