/*9. Створіть два масиви з 10 цілих випадкових чисел з відрізка [1; 9] 
 * і третій масив з 10 дійсних чисел. 
 * Кожен елемент з i-им індексом третього масиву повинен дорівнювати 
 * відношенню елементу з першого масиву з i-им індексом 
 * до елементу з другого масиву з i-им індексом. 
 * Вивести всі три масиву на екран (кожен на окремому рядку), 
 * потім вивести кількість цілих елементів в третьому масиві.
 * */

package hw;

import java.text.DecimalFormat;
import java.util.Random;

public class Arrays9 {

	public static void main(String[] args) {

		Random random = new Random();
		DecimalFormat df = new DecimalFormat("0.00");

		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		double[] arr3 = new double[10];

		int integerValue = 0;

		for (int i = 0; i < 10; i++) {
			arr1[i] = random.nextInt(9) + 1;
			arr2[i] = random.nextInt(9) + 1;
			arr3[i] = (double) arr1[i] / arr2[i];
		}

		System.out.print("Array1:  ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "  ");
		}
		System.out.println();

		System.out.print("Array2:  ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "  ");
		}
		System.out.println();

		System.out.print("Array3:  ");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(df.format(arr3[i]) + "  ");
			if ((arr3[i] == Math.floor(arr3[i])) && !Double.isInfinite(arr3[i])) {
				integerValue++;
			}
		}
		System.out.println();
		System.out.println("We have " + integerValue + " integer values in Array3");
	}
}
