//5. ������� �� ����� �� ����� ����������� 2an-1-1, 
//   �� a1 = 2, �� ����� 10000.

package hw;

public class Loops5 {

	public static void main(String[] args) {
		
		for (int a = 2; a < 10000; a = 2 * a - 1) {
			System.out.println(a);
		}
	}
}
