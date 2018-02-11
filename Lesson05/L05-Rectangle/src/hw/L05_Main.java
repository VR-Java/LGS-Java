package hw;

import java.util.Scanner;

public class L05_Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		r1.setLength(100);
		r1.setWidth(28);
		
		Rectangle r2 = new Rectangle(54, 45);
		
		Rectangle r3 = new Rectangle(readInt(), readInt());
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
	}

	public static int readInt() {
		System.out.println("Ââåä³òü ö³ëå ÷èñëî, á³ëüøå 0");
		int n = scan.nextInt();
		while (true) {
			if (n > 0) {
				return n;
			}
		}
	}

}
