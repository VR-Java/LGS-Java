//11. ������� �� ����� ����� 11 ����� ����������� Գ�������. 
//    ��������, �� ������ � ������ ����� ����������� ��� ��������, 
//    � ����� ��������� - ����� ���� ���������.

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
