/*1. Створити двовимірний масив з 8 рядків по 5 стовпців в кожній з випадкових цілих чисел 
 * з відрізка [10; 99]. Вивести масив на екран.
 * */

package hw;

import java.util.Random;

public class L04_Arrays1 {

	public static void main(String[] args) {

		Random r = new Random();

		int[][] arr = new int[8][5];

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = r.nextInt(90) + 10;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
