//12. ��� ��������� ������������ � ��������� ������������ ����� 
//    ��������� ���� ��� ���� ���� (���������� �� ����� ������ 
//    ���� ���� � ����).

package hw;

import java.util.Scanner;

public class Loops12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your number");
		int userNumber = sc.nextInt();
		
		int lastNumber= userNumber;
		int sum = 0;
		
		do {
			sum += lastNumber % 10;
			lastNumber /= 10;
		}while(lastNumber != 0);
		
		System.out.println("Sum of all digits in number " + userNumber + " = " + sum);
		
	}

}
