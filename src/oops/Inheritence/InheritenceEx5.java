package oops.Inheritence;


class Axx {
protected int x = 1;
protected void setX(int a){
x=a;
}
protected int getX(){
return x;}
}
class Bxx extends Axx {
protected int x = 3;
public int getX(){
return x; }
public int getB(){
return x;
}
} 

public class InheritenceEx5 {

	public static void main(String[] args) {
		Axx a = new Axx();
		Axx b = new Bxx(); //polymorphism, making shadowing possible!
		System.out.println(a.getX());
		System.out.println(b.getX());//override, access subclass attri.
		//System.out.println(b.getB()); not able to load subclass method!
		System.out.println(a.x);
		System.out.println(b.x); //variable shadowing!
	}

}
