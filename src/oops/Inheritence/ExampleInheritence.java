package oops.Inheritence;

class Aa{
int x=1;
public void setX(int a) 
{
	x=a;
}
}
class Bb extends Aa
{
	public int getB() {
		setX(20);
		return x;
	}
}
public class ExampleInheritence {
	public static void main(String[] args) {
		Aa a = new Aa();
		Bb b =  new Bb();
		System.out.println(a.x);
		System.out.println(b.getB());
	}

}
