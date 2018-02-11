/*2. Створити двовимірний масив з 5 рядків по 8 стовпців в кожній 
 * з випадкових цілих чисел з відрізка [-99; 99]. Вивести масив на екран. 
 * Після на окремому рядку вивести на екран значення максимального елемента 
 * цього масиву (його індекс не має значення).
 * */

package hw;

public class L04_Arrays2 {

	public static void main(String[] args) {

		int[][] arr = new int[5][8];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 8; j++) {
				arr[i][j] = (int) (Math.random() * 199) - 99;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		int max = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 8; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		System.out.println("Max value = " + max);
	}
}
