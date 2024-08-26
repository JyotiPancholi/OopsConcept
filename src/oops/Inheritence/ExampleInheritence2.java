package oops.Inheritence;

class Ax
{
private int x=1;
protected void setX(int a) {
	x=a;
}
protected int getX() {
	return x;
}
}
class Bx extends Ax
{
	public int getB(){
		setX(2);
		//return x; It does not work because private modifier, so
		return getX();	
}
}
public class ExampleInheritence2 {

	public static void main(String[] args) {
		Ax a = new Ax();
		Bx b = new Bx();
		System.out.println(a.getX());//a.x is not allowed, private!
		System.out.println(b.getB());
	}
}
