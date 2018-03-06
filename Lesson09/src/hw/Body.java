package hw;

public class Body {

	private int doorsQuantity;
	private int weight;
	private int wheelsQuantity;

	public Body(int doorsQuantity, int weight, int wheelsQuantity) {
		this.doorsQuantity = doorsQuantity;
		this.weight = weight;
		this.wheelsQuantity = wheelsQuantity;
	}

	public int getDoorsQuantity() {
		return doorsQuantity;
	}

	public int getWeight() {
		return weight;
	}

	public int getWheelsQuantity() {
		return wheelsQuantity;
	}

	public void openDoor() {
		System.out.println("Open the door");
	}

	@Override
	public String toString() {
		return "Body [doorsQuantity=" + doorsQuantity + ", weight=" + weight + ", wheelsQuantity=" + wheelsQuantity
				+ "]";
	}

}
