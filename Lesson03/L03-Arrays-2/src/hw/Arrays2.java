/*2. Створіть масив з усіх непарних чисел від 1 до 99, 
 * виведіть його на екран у рядок, а потім цей же масив 
 * виведіть на екран теж в рядок, але в зворотному порядку 
 * (99 97 95 93 ... 7 5 3 1).
 * */

package hw;

public class Arrays2 {

	public static void main(String[] args) {

		int[] arr2 = new int[50];

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = i * 2 + 1;
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		for (int i = arr2.length - 1; i >= 0; i--) {
			System.out.print(arr2[i] + " ");
		}
	}
}
