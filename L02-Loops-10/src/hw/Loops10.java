//10. Створіть програму, що виводить на екран 12 перших елементів 
//    послідовності 2an-2-2, де a1 = 3 і a2 = 2.

package hw;

public class Loops10 {

	public static void main(String[] args) {

		int a;
		int a1 = 3;
		int a2 = 2;

		System.out.println(a1);
		System.out.println(a2);
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				a = 2 * a1 - 2;
				a1 = a;
				System.out.println(a);
			} else {
				a = 2 * a2 - 2;
				a2 = a;
				System.out.println(a);
			}
		}
	}
}
