package date;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Lambdas {
	static class Phone {
		private String make;
		private String model;
		private int memory;
		private double screen;
		private String color;
		private int price;
		
		public Phone(String make, String model, int memory, double screen, String color, int price) {
			this.make = make;
			this.model = model;
			this.memory = memory;
			this.screen = screen;
			this.color = color;
			this.price = price;
		}

		@Override
		public String toString() {
			return "Phone [make=" + make + ", model=" + model + ", memory=" + memory + ", screen=" + screen + ", color="
					+ color + "]";
		}
	}
	static Phone[] phones = {
			new Phone("iPhone", "5s", 32, 4, "black", 120),
			new Phone("iPhone", "4", 16, 4, "black", 80),
			new Phone("iPhone", "4", 8, 4, "white", 70),
			new Phone("iPhone", "5s", 16, 4, "black", 130),
			new Phone("iPhone", "5s", 16, 4, "black", 130),
			new Phone("iPhone", "7", 128, 4.5, "black", 600),
			new Phone("samsung", "s6", 32, 4.7, "black", 110),
			new Phone("samsung", "s6", 64, 4.7, "white", 130),
			new Phone("samsung", "s7", 128, 4.8, "black", 400),
			new Phone("samsung", "s8", 32, 5.0, "black", 650),
			new Phone("samsung", "s8", 64, 5.0, "white", 700),
			new Phone("samsung", "s6", 32, 4.7, "black", 135)
	};
	
	
	public static void main(String[] args) {
		
		System.out.println("Sorting using stream");
		List<Phone> list = Arrays.stream(phones) //беремо стрім з масиву
									.sorted((e1, e2) -> (e1.price - e2.price)) //сортуємо наш стрім
									.collect(Collectors.toList()); //"збираємо" значення в ліст
		
		Consumer<Phone> customPrint = e -> System.out.println(e.make + " " + e.model + " " + e.price);// силка на лямбда-вираз
		list.forEach(customPrint);
		
		
		
		System.out.println("Interface implementation using lamda expression");
		new Thread(() ->  System.out.println("Hello world")).start(); //анонімна реалізація інтерфейсу лямбдою
		
		
		System.out.println("Filter collections using streams");
		list.stream() //стрім з колекцій береться напряму
			.filter(e -> e.screen > 4) //фільтруємо, лишаться лише ті значення які вертають true
			.filter(e -> e.price < 500)
			.filter(e -> e.color.equals("black"))
			.forEach(System.out::println);
		
		
		System.out.println("Find some max/min value using stream");
		
		int maxPrice = list.stream()
						.mapToInt(e -> e.price) //конвертуємо наші елементи Phone -> int (по-суті маємо врезультаті стрім інтів)
						.max() //шукаємо максимальне значення
						.orElse(0); //якщо значень немає то вернеться це
		System.out.println("maxPrice=" + maxPrice);
		
	}
	
	
}
