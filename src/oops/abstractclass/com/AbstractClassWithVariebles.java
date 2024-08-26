package oops.abstractclass.com;

abstract class Vehicle {
	private String brand;
	protected int speed;
	public static int totalVehicles = 0;

	public Vehicle(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
		totalVehicles++;
	}

	public String getBrand() {
		return brand;
	}

	public int getSpeed() {
		return speed;
	}

	public static int getTotalVehicles() {
		return totalVehicles;
	}

	abstract void accelerate(); // Abstract method
}

class Car extends Vehicle {
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void accelerate() {
        speed += 10;
        System.out.println(getBrand() + " is accelerating. New speed: " + speed);
    }
}

public class AbstractClassWithVariebles {

	public static void main(String[] args) {
		Car car1 = new Car("Toyota", 50);
		Car car2 = new Car("Honda", 60);

		car1.accelerate();
		car2.accelerate();

		System.out.println("Total vehicles: " + Vehicle.getTotalVehicles());
	}

}
