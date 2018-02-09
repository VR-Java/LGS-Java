/*8. Створіть масив з 12 випадкових цілих чисел з відрізка [-15; 15]. 
 * Визначте який елемент є в цьому масиві максимальним і повідомте індекс 
 * його останнього входження в масив
 * */

package hw;

import java.util.Random;

public class Arrays8 {

	public static void main(String[] args) {

		Random random = new Random();

		int[] arr = new int[12];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(31) - 15;
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int max = arr[0];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("Max element : " + max);
		System.out.println("last index : " + index);
	}
}
