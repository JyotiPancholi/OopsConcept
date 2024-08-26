package oops.Inheritence;

class Az {
protected int x = 1;
protected void setX(int a)
{x=a;}
protected int getX()
{return x;}
}

class Bz extends Az {
public int getB(){
setX(2);
return x;
}
}

public class ExampleInheritence3 {
public static void main(String [] args){
Az a = new Az();
Bz b = new Bz();
System.out.println(a.getX());
System.out.println(b.x); //b.x is protected, then inherited.
System.out.println(b.getB());
}
}
