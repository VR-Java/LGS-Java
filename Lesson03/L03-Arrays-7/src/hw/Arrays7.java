/*7. Створіть масив з 20-ти перших чисел Фібоначчі і виведіть його на екран. 
 * Нагадуємо, що перший і другий члени послідовності рівні одиницям, 
 * а кожен наступний - сумою двох попередніх.
 * */

package hw;

public class Arrays7 {

	public static void main(String[] args) {

		int[] fibo = new int[20];
		fibo[0] = 1;
		fibo[1] = 1;

		for (int i = 2; i < fibo.length; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}

		for (int i = 0; i < fibo.length; i++) {
			System.out.print(fibo[i] + " ");
		}
	}
}