/*3. Створіть масив з 15 випадкових цілих чисел 
 * з відрізка [0; 9]. Виведіть масив на екран. 
 * Підрахуйте скільки в масиві парних елементів 
 * і виведете цю кількість на екран на окремому рядку.
 * */

package hw;

import java.util.Random;

public class Arrays3 {

	public static void main(String[] args) {

		Random random = new Random();

		int[] arr3 = new int[15];
		int countEven = 0;

		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = random.nextInt(10);
			if (arr3[i] % 2 == 0) {
				countEven++; // 0 - парне число
			}
		}

		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		System.out.println("We have " + countEven + " even numbers");
	}
}
