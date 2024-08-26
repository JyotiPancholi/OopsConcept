package oops.constructors.com;

class Car {
	String brand;

	public Car() {
		this.brand = "ford";
	}

	public String getBrand() {
		return brand;
	}

	void run() {
		System.out.println("car is running !");
	}

}

public class TestCar {

	public static void main(String[] args) {
		Car ford = new Car();
		String brand = ford.getBrand();
		System.out.println(brand);
	}

}
