//4. Створіть програму, що виводить на екран перші 20 елементів 
//   послідовності 2 4 8 16 32 64 128 ....

package hw;

public class Loops4 {

	public static void main(String[] args) {

		int a = 2;
		for (int i = 0; i < 20; i++) {
			System.out.println(a);
			a *= 2;
		}
	}
}
