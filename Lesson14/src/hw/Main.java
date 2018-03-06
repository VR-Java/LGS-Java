package hw;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	private static Set<Commodity> set = new TreeSet<>();

	public static void main(String[] args) {

		readAllComodities();
		menu();

	}

	private static void readAllComodities() {
		set.add(new Commodity("Ball", 59, 8));
		set.add(new Commodity("Shoes", 2050, 2));
		set.add(new Commodity("Umbrella", 530, 5));
		set.add(new Commodity("Phone", 14000, 8));
		set.add(new Commodity("Notebook", 22000, 3));
		set.add(new Commodity("Bicycle", 16000, 1));
		set.add(new Commodity("Camera", 16000, 4));
		set.add(new Commodity("Oven", 1200, 2));
		set.add(new Commodity("Table", 440, 7));
		set.add(new Commodity("Candle", 25, 35));
	}

	private static void menu() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			writeMenu();
			int choise = sc.nextInt();

			switch (choise) {
			case 1:
				System.out.println("Adding new Commodity");
				addComodity();
				break;
			case 2:
				System.out.println("Removing Commodity");
				removeCommodity();
				break;
			case 3:
				System.out.println("Changing Commodity");
				changeCommodity();
				break;
			case 4:
				System.out.println("Sorting by Name");
				set = sortByName();
				break;
			case 5:
				System.out.println("Sorting by Price");
				set = sortByPrice();
				break;
			case 6:
				System.out.println("Sorting by Quantity");
				set = sortByQuantity();
				break;
			case 7:
				System.out.println("Printing Commodity");
				printCommodity();
				break;
			case 8:
				System.out.println("Printing all Commodities");
				set.forEach(System.out::println);
				break;
			case 9:
				System.out.println("Exit the programm");
				System.exit(0);
				break;
			default:
				System.out.println("Make correct choise: 1-8");
				break;
			}
		}
	}

	private static void writeMenu() {
		System.out.println();
		System.out.println("_________________________");
		System.out.println("MENU:");
		System.out.println("1 - add new Commodity");
		System.out.println("2 - remove Commodity");
		System.out.println("3 - change Commodity");
		System.out.println("4 - sort by Name");
		System.out.println("5 - sort by Price");
		System.out.println("6 - sort by Quantity");
		System.out.println("7 - print element");
		System.out.println("8 - print all elements");
		System.out.println("9 - exit");
		System.out.println("_________________________");
		System.out.println();
	}

	private static void addComodity() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input name:");
		String name = checkString(sc);
		System.out.println("Input price (double)");
		double price = checkDouble(sc);
		System.out.println("Input quantity (int)");
		int quantity = checkInt(sc);

		int sizeOld = set.size();
		Commodity c = new Commodity(name, price, quantity);
		if (!c.getName().equalsIgnoreCase("NoName") & c.getPrice() != 0 && c.getQuantity() != 0) {
			set.add(c);
			if (set.size() > sizeOld) {
				System.out.println(c + " successfully added to your Set");
			} else {
				System.out.println(c + " already exists in your Set");
			}
		} else {
			System.out.println("Your Commodity hes been not created");
		}
	}

	private static String checkString(Scanner sc) {
		try {
			String text = sc.next();
			return text;
		} catch (Exception e) {
			return "NoName";
		}
	}

	private static Double checkDouble(Scanner sc) {
		try {
			double d = sc.nextDouble();
			return d;
		} catch (Exception e) {
			return 0.0;
		}
	}

	private static int checkInt(Scanner sc) {
		try {
			int i = sc.nextInt();
			return i;
		} catch (Exception e) {
			return 0;
		}
	}

	private static void removeCommodity() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input name");
		String name = checkString(sc);

		if (findCommodityName(name) > 1) {
			System.out.println("Input price");
			double price = checkDouble(sc);
			if (findCommodityPrice(price) == 0) {
				System.out.println("There is no element like this");
			} else {
				while (findCommodityPrice(price) >= 1) {
					remove(name, price);
				}
			}
		} else if (findCommodityName(name) == 1) {
			remove(name);
		} else {
			System.out.println("There is no element like this");
		}
	}

	private static int findCommodityName(String name) {
		int count = 0;
		for (Commodity commodity : set) {
			if (commodity.getName().equalsIgnoreCase(name)) {
				count++;
			}
		}
		return count;
	}

	private static int findCommodityPrice(Double price) {
		int count = 0;
		for (Commodity commodity : set) {
			if (Double.compare(commodity.getPrice(), price) == 0) {
				count++;
			}
		}
		return count;
	}

	private static void remove(String name) {
		Iterator<Commodity> iter = set.iterator();
		while (iter.hasNext()) {
			Commodity c = iter.next();
			if (c.getName().equalsIgnoreCase(name)) {
				System.out.println(c + "has been removed");
				iter.remove();
			}
		}
	}

	private static void remove(String name, Double price) {
		Iterator<Commodity> iter = set.iterator();
		while (iter.hasNext()) {
			Commodity c = iter.next();
			if (c.getName().equalsIgnoreCase(name) && c.getPrice() == price) {
				System.out.println(c + "has been removed");
				iter.remove();
			}
		}
	}

	private static void changeCommodity() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input name of Commodity you want to change");
		String name = checkString(sc);
		System.out.println("Input price (double)");
		double price = checkDouble(sc);
		System.out.println("Input quantity (int)");
		int quantity = checkInt(sc);

		Commodity c = new Commodity(name, price, quantity);
		if (set.contains(c)) {
			set.forEach(System.out::println);
			System.out.println();
			Commodity cNew = changeFields(c);
			Iterator<Commodity> i = set.iterator();
			while (i.hasNext()) {
				Commodity currCommodity = i.next();
				if (currCommodity.compareTo(c) == 0) {
					System.out.println(c + " will be removed");
					i.remove();
				}
			}
			set.add(cNew);
			System.out.println();
		}
	}

	private static Commodity changeFields(Commodity c) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose field you want to change:");
		System.out.println("1 - name");
		System.out.println("1 - price");
		System.out.println("1 - quantity");

		int choise = sc.nextInt();

		String newName = c.getName();
		double newPrice = c.getPrice();
		int newQuantity = c.getQuantity();

		switch (choise) {
		case 1:
			System.out.println("Input new Name");
			newName = checkString(sc);
			break;
		case 2:
			System.out.println("Input new Price");
			newPrice = checkDouble(sc);
			break;
		case 3:
			System.out.println("Input new Quantity");
			newQuantity = checkInt(sc);
			break;
		default:
			System.out.println("Input correct data");
			return c;
		}
		return new Commodity(newName, newPrice, newQuantity);
	}

	private static Set<Commodity> sortByName() {
		Set<Commodity> setName = new TreeSet<>(new Comparator<Commodity>() {

			@Override
			public int compare(Commodity o1, Commodity o2) {
				int res = o1.getName().compareToIgnoreCase(o2.getName());
				if (res == 0) {
					res = Double.compare(o1.getPrice(), o2.getPrice());
					if (res == 0) {
						res = o1.getQuantity() - o2.getQuantity();
					}
				}
				return res;
			}
		});
		setName.addAll(set);
		return setName;
	}

	private static Set<Commodity> sortByPrice() {
		Set<Commodity> setName = new TreeSet<>(new Comparator<Commodity>() {

			@Override
			public int compare(Commodity o1, Commodity o2) {
				int res = Double.compare(o1.getPrice(), o2.getPrice());
				if (res == 0) {
					res = o1.getName().compareToIgnoreCase(o2.getName());
					if (res == 0) {
						res = o1.getQuantity() - o2.getQuantity();
					}
				}
				return res;
			}
		});
		setName.addAll(set);
		return setName;
	}

	private static Set<Commodity> sortByQuantity() {
		Set<Commodity> setName = new TreeSet<>(new Comparator<Commodity>() {

			@Override
			public int compare(Commodity o1, Commodity o2) {
				int res = o1.getQuantity() - o2.getQuantity();
				if (res == 0) {
					res = Double.compare(o1.getPrice(), o2.getPrice());
					if (res == 0) {
						res = o1.getName().compareToIgnoreCase(o2.getName());
					}
				}
				return res;
			}
		});
		setName.addAll(set);
		return setName;
	}

	private static void printCommodity() {

	}

}
