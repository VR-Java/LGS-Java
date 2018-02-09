/*5. Створіть 2 масиви з 5 випадкових цілих чисел 
 * з відрізка [0; 5] кожен, виведіть масиви на екран у двох 
 * окремих рядках. Порахуйте середнє арифметичне елементів 
 * кожного масиву і повідомте, для якого з масивів це значення 
 * виявилося більше (або повідомте, що їх середні 
 * арифметичні рівні).
 * */

package hw;

import java.util.Random;

public class Arrays5 {

	public static void main(String[] args) {

		Random random = new Random();

		int[] arrA = new int[5];
		int[] arrB = new int[5];

		int sumA = 0;
		int sumB = 0;

		for (int i = 0; i < arrA.length; i++) {
			arrA[i] = random.nextInt(6);
			sumA += arrA[i];
			System.out.print(arrA[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < arrB.length; i++) {
			arrB[i] = random.nextInt(6);
			sumB += arrB[i];
			System.out.print(arrB[i] + " ");
		}
		System.out.println();

		if (sumA == sumB) {
			System.out.println("Середнє арифметичне значення для обох масивів однакове: " + (double) sumA / arrA.length);
		} else {
			if (sumA > sumB) {
				System.out.println("Середнє арифметине для масиву А виявилося більшим: " + (double) sumA / arrA.length);
			} else {
				System.out.println("Середнє арифметине для масиву B виявилося більшим: " + (double) sumB / arrB.length);
			}
		}
	}
}
