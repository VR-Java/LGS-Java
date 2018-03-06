package hw;

public class Main {

	public static void main(String[] args) {

		Car car = new Car("yellow", new Body(2, 1500, 4), new SteeringWheel(350), new Wheel(400));

		System.out.println(car);

		car.drive();
		car.turnLeft();

		car.getWheels().brake();
		car.getBody().openDoor();
	}

}
