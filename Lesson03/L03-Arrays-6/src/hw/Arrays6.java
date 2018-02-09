/*6. Створіть масив з 4 випадкових цілих чисел з відрізка [10; 99], 
 * виведіть його на екран у рядок. Визначити і вивести на екран 
 * повідомлення про те, чи є масив строго зростаючої послідовністю.
 * */

package hw;

import java.util.Random;

public class Arrays6 {

	public static void main(String[] args) {

		Random random = new Random();

		int[] arr = new int[4];
		int flag = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(90) + 10;
			if (i != 0 && arr[i] > arr[i - 1]) {
				flag++;
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		if (flag == 3) {
			System.out.println("Масив є строго зростаючою послідоовністю!");
		} else {
			System.out.println("Масив не зростаючий");
		}
	}
}
