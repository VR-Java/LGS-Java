package cw;

public class Car {

	private String make;
	private String model;
	private int year;
	private double capacity;

	private Car() {

	}

	public Car(String make, String model, int year, double capacity) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", capacity=" + capacity + "]";
	}

	// pattern
	public static class Builder {

		private Car car = new Car();

		public Builder make(String make) {
			car.make = make;
			return this;
		}

		public Builder model(String model) {
			car.model = model;
			return this;
		}

		public Builder year(int year) {
			car.year = year;
			return this;
		}

		public Builder capacity(double capacity) {
			car.capacity = capacity;
			return this;
		}

		public Car build() {
			return car;
		}

	}

}







package cw;

public class CarBuilderExample {

	public static void main(String[] args) {

		Car car = new Car.Builder().year(2011)
									.make("Sedan")
									.model("Audi")
									.build();
		System.out.println(car);
	}

}
