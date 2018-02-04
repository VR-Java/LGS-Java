//3. Створіть програму, що виводить на екран всі невід'ємні елементи 
//   послідовності 90 85 80 75 70 65 60 ....

package hw;

public class Loops3 {

	public static void main(String[] args) {

		int a = 90;
		while (a > 0) {
			System.out.println(a);
			a -= 5;
		}
	}
}
