/*1. Створіть масив з усіх парних чисел від 2 до 20 
 * і виведіть елементи масиву на екран спочатку в рядок, 
 * відокремлюючи один елемент від іншого прогалиною, 
 * а потім в стовпчик (відокремлюючи один елемент від іншого 
 * початком нового рядка). Перед створенням масиву подумайте, 
 * якого він буде розміру.
 * 2 4 6 … 18 20 
 * 2 
 * 4 
 * 6 
 * … 
 * 20
 * */

package hw;

public class Arrays1 {

	public static void main(String[] args) {

		int[] arr1 = new int[10];

		for (int i = 0; i < 10; i++) {
			arr1[i] = i * 2 + 2;
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
