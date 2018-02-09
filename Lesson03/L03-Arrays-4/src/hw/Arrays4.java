/*4. Створіть масив з 8 випадкових цілих чисел 
 * з відрізка [1; 10]. Виведіть масив на екран у рядок. 
 * Замініть кожен елемент з непарним індексом на нуль. 
 * Знову виведете масив на екран на окремому рядку.
 * */

package hw;

import java.util.Random;

public class Arrays4 {

	public static void main(String[] args) {

		Random random = new Random();

		int[] arr4 = new int[8];

		for (int i = 0; i < arr4.length; i++) {
			arr4[i] = random.nextInt(10) + 1;
			System.out.print(arr4[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < arr4.length; i++) {
			if (i % 2 != 0) {
				arr4[i] = 0;
			}
			System.out.print(arr4[i] + " ");
		}
	}
}
