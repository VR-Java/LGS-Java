//8. ������� �� ����� �� �������� ��������� ������������ �����, 
//   ��������� ������������ � ���������.

package hw;

import java.util.Scanner;

public class Loops8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input your number");

		int userNumber = sc.nextInt();

		for (int i = userNumber; i > 0; i--) {
			if (userNumber % i == 0) {
				System.out.println(i);
			}
		}
	}
}
