package hw;

public class Rectangle {

	private int length;
	private int width;

	public Rectangle() {
	}

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int perimeter(Rectangle rectangle) {
		return 2 * (rectangle.getLength() + rectangle.getWidth());
	}

	public int area(Rectangle rectangle) {
		return rectangle.getLength() * rectangle.getWidth();
	}

	@Override
	public String toString() {
		return "Прямокутник " + length + "х" + width + "мм. Площа прямокутника = " + area(this) + " мм2, Периметр = "
				+ perimeter(this) + " мм";
	}

}
