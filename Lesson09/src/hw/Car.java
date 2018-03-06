package hw;

import java.util.Arrays;

public class Car {

	private String color;
	private Body body;
	private SteeringWheel sw;
	private Wheel[] wheels;

	public Car(String color, Body body, SteeringWheel sw, Wheel wheel) {
		this.color = color;
		this.body = body;
		this.sw = sw;

		int wheelsQuantity = body.getWheelsQuantity();
		this.wheels = new Wheel[wheelsQuantity];

		for (int i = 0; i < wheels.length; i++) {
			this.wheels[i] = wheel;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Body getBody() {
		return body;
	}

	public SteeringWheel getSw() {
		return sw;
	}

	public Wheel getWheels() {
		return wheels[0];
	}

	public void drive() {
		System.out.println("Start Engine");
		System.out.println("and drive");
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", body=" + body + ", sw=" + sw + ", wheels=" + Arrays.toString(wheels) + "]";
	}

	public void turnLeft() {
		sw.turnLeft();
	}

}
