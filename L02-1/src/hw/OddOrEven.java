package hw;

import java.util.Random;

public class OddOrEven {

	public static void main(String[] args) {

		Random rand = new Random();
		int a = rand.nextInt(100);

		if (a % 2 == 0) {
			System.out.println("Number " + a + " is even");
		} else {
			System.out.println("Number " + a + " is odd");
		}
	}
}
