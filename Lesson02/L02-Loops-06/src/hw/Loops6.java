//6. Виведіть на екран всі двозначні члени послідовності 2an-1 + 200, 
//   де a1 = -166.

package hw;

public class Loops6 {

	public static void main(String[] args) {

		for (int a = -166; a < 100; a = 2 * a + 200) {
			if (Math.abs(a / 10) < 10) {
				System.out.println(a);
			}
		}
	}
}
