//11. Виведіть на екран перші 11 членів послідовності Фібоначчі. 
//    Нагадуємо, що перший і другий члени послідовності рівні одиницям, 
//    а кожен наступний - сумою двох попередніх.

package hw;

public class Loops11 {

	public static void main(String[] args) {

		for (int i = 0, a = 0, b = 0, sum = 0; i < 11; i++) {
			if (i == 0) {
				b = 1;
			}
			
			sum = a + b;
			a = b;
			b = sum;
			
			System.out.println(a);
		}
	}
}
