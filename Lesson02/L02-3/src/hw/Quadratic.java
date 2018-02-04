package hw;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Template: A*x2 + B*x + C = 0");

		System.out.print("Input A: ");
		int a = sc.nextInt();
		System.out.print("Input B: ");
		int b = sc.nextInt();
		System.out.print("Input C: ");
		int c = sc.nextInt();

		System.out.println("(" + a + ")*x2 + (" + b + ")*x + (" + c + ") = 0");

		double d = (b * b - 4 * a * c);
		System.out.println("D = " + d);

		double x1 = 0;
		double x2 = 0;

		if (d >= 0) {
			x1 = ((-b + Math.sqrt(d)) / (2 * a));
			x2 = ((-b - Math.sqrt(d)) / (2 * a));
			System.out.println("X1 = " + x1);
			System.out.println("X2 = " + x2);
		} else {
			System.out.println("There is no real results for your Quadratic");
		}
	}
}
