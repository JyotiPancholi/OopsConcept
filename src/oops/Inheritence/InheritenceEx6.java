package oops.Inheritence;
class Aaa {
protected int x = 1;
protected void setX(int a){
x=a;
}
protected int getX(){
return x;}
}
class Bbb extends Aaa {
protected int x = 3;
public int getX(){
setX(2); // call superclass method to set superclass attrib
return x; } //but return attrib of subclass
public int getB(){
return x;
}
} 

public class InheritenceEx6 {

	public static void main(String[] args) {
		Aaa a = new Aaa();
		Aaa b = new Bbb();
		System.out.println(a.getX());
		System.out.println(b.getX());
		System.out.println(a.x);
		System.out.println(b.x);
	}

}
