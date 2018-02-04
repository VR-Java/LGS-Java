//9. Перевірте, чи є введене користувачем з клавіатури натуральне число - 
//   простим. Постарайтеся не виконувати зайвих дій (наприклад, 
//   після того, як ви знайшли хоча б один нетривіальний дільник вже ясно, 
//   що число складене і перевірку продовжувати не потрібно). 
//   Також врахуйте, що найменший дільник натурального числа n, 
//   якщо він взагалі є, обов'язково розташовується в відрізку [2; √n].

package hw;

import java.util.Scanner;

public class Loops9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input your number");

		int userNumber = sc.nextInt();

		for (int i = 2; i <= Math.sqrt(userNumber); i++) {
			if (userNumber % i == 0) {
				System.out.println(userNumber + " is not SIMPLE");
				System.exit(0);
			}
		}

		System.out.println("Number " + userNumber + " is SIMPLE");
	}
}
