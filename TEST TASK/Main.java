package test;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	static CinemaUtils cu = new CinemaUtils();
	
	public static void main(String[] args) {
		
		
		
		Film film1 = new Film("Terminator");
		Film film2 = new Film("Back to Future");
		Film film3 = new Film("I'm Robot");
		
		Room room1 = new Room(1);
		Room room2 = new Room(2);
		Room room3 = new Room(3);
		
		Session s1 = new Session(film1, room1);
		Session s2 = new Session(film2, room3);
		Session s3 = new Session(film3, room3);
		
		LocalDateTime time1 = LocalDateTime.of(2018, 04, 01, 17, 30);
		
		System.out.println(time1);
		
		cu.getShedule();
		
		cu.addSession(s1);
		
		
	}
	
	
	

}
