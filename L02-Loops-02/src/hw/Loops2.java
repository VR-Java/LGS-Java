//2. Створіть програму, що виводить на екран перші 55 елементів 
//   послідовності 1 3 5 7 9 11 13 15 17 ....

package hw;

public class Loops2 {

	public static void main(String[] args) {

		int a = 55;
		int i = -1;
		
		do {
			System.out.println(i += 2);
			a--;
		} while (a > 0);
	}
}
