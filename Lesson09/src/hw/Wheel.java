package hw;

public class Wheel {

	private int size;

	public Wheel(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Wheel [size=" + size + "]";
	}

	public void brake() {
		System.out.println("Stop the car!");
	}

}
