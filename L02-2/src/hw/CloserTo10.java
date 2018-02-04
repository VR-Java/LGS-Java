package hw;

import java.util.Scanner;

public class CloserTo10 {

	public static void main(String[] args) {

		double number = 10;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input number A:");
		double numberA = sc.nextDouble();
		System.out.println("Thanks. A = " + numberA);
		System.out.println();
		
		System.out.println("Input number B:");
		double numberB = sc.nextDouble();
		System.out.println("Thanks. B = " + numberB);
		System.out.println();

		System.out.println("Calculating what number is closer to " + number + "...");
		System.out.println();

		if (Math.abs(number - numberA) != Math.abs(number - numberB)) {
			if (Math.abs(number - numberA) < Math.abs(number - numberB)) {
				System.out.println(numberA + " is closer to " + number);
			} else {
				System.out.println(numberB + " is closer to " + number);
			}
		} else {
			System.out.println("Both A and B are on same distance from " + number);
		}
	}
}
