package hw;

public class SteeringWheel {

	private int diameter;

	public SteeringWheel(int diameter) {
		this.diameter = diameter;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	@Override
	public String toString() {
		return "SteeringWheel [diameter=" + diameter + "]";
	}

	public void turnLeft() {
		System.out.println("We're turning left");
	}

}
