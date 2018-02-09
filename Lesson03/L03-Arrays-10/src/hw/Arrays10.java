/*10. Створіть масив з 11 випадкових цілих чисел з відрізка [-1; 1], 
 * виведіть масив на екран у рядок. Визначте який елемент 
 * зустрічається в масиві найчастіше і виведіть про це повідомлення 
 * на екран. Якщо два якихось елемента зустрічаються однакову кількість
 * разів, то не виводьте нічого.
*/

package hw;

import java.util.Random;

public class Arrays10 {

	public static void main(String[] args) {

		Random random = new Random();

		int[] arr = new int[11];

		int countBelow0 = 0;
		int countAbove0 = 0;
		int count0 = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(3) - 1;
			System.out.print(arr[i] + "  ");

			if (arr[i] == 0) {
				count0++;
			} else {
				if (arr[i] > 0) {
					countAbove0++;
				} else {
					countBelow0++;
				}
			}
		}
		System.out.println();

		System.out.println("  1 : " + countAbove0);
		System.out.println("  0 : " + count0);
		System.out.println(" -1 : " + countBelow0);

		if (countAbove0 != count0 & countBelow0 != count0 & countAbove0 != countBelow0) {
			int max = Math.max(Math.max(countAbove0, countBelow0), count0);
			if (max == countAbove0) {
				System.out.println("Most popular element is 1 : " + countAbove0 + " times");
			} else if (max == countBelow0) {
				System.out.println("Most popular element is -1 : " + countBelow0 + " times");
			} else if (max == count0) {
				System.out.println("Most popular element is 0 : " + count0 + " times");
			}
		}
	}
}
