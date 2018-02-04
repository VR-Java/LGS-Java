//7. Створіть програму, яка обчислює факторіал натурального числа n, 
//   яке користувач введе з клавіатури.

package hw;

import java.util.Scanner;

public class Loops7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input some Number");
		int userNumber = sc.nextInt(); 

		long factorial = 1L;

		for (int i = 1; i <= userNumber; i++) {
			factorial *= i;
		}
		System.out.println(userNumber + "! = " + factorial);
	}
}
