package date;

import java.time.LocalDateTime;
import java.time.Month;

public class Dates {
	public static void main(String[] args) {
		
		//Get current time
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		//Get time from values
		LocalDateTime time2 = LocalDateTime.of(2018, Month.APRIL, 1, 17, 30);
		System.out.println(time2);
		//Parse from iso string
		LocalDateTime time3 = LocalDateTime.parse("2017-10-03T10:44:22");
		System.out.println(time3);
		//date comparing
		System.out.println(time3.compareTo(time2));
	}
}
