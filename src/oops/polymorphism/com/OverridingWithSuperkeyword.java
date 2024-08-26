package oops.polymorphism.com;

class Vehicle
{
    void start()
	{
        System.out.println("Vehicle starting...");
    }
}
 
class Car extends Vehicle
{
    @Override
    void start()
	{
        super.start();
        System.out.println("Car starting...");
    }
}
public class OverridingWithSuperkeyword {
	 public static void main(String[] args)
		{
	        Car car = new Car();
	        car.start();
	    }
}
