
public class Phone implements Comparable<Phone> {
	private String model;
	private int price;
	private int memory;
	private double diagonal;
	
	public Phone(String model, int price) {
		this.model = model;
		this.price = price;
	}
	public Phone(String model, int price, int memory, double diagonal) {
		this.model = model;
		this.price = price;
		this.memory = memory;
		this.diagonal = diagonal;
	}


	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public double getDiagonal() {
		return diagonal;
	}
	public void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
	}
	@Override
	public String toString() {
		return "Phone [model=" + model + ", price=" + price + ", memory=" + memory + ", diagonal=" + diagonal + "]";
	}
	@Override
	public int compareTo(Phone o) {
		int res = model.compareToIgnoreCase(o.model);
		if (res == 0) {
			res = price - o.price;
			if (res == 0) {
				res = memory - o.memory;
				if (res == 0) {
					res = Double.compare(diagonal, diagonal);
				}
			}
		}
		return -res;
	}	
}



//----------------------------------------------------------------------------------------------


import java.util.Comparator;

public class PhoneComparatorByDiagonal implements Comparator<Phone> {

	private boolean desc;
	
	public PhoneComparatorByDiagonal() {
	}
	
	public PhoneComparatorByDiagonal(boolean desc) {
		this.desc = desc;
	}

	@Override
	public int compare(Phone o1, Phone o2) {
		int res = Double.compare(o1.getDiagonal(), o2.getDiagonal());
		if (res == 0) {
			res = o1.getModel() == null ? res : 
						o1.getModel().compareToIgnoreCase(o2.getModel());
			if (res == 0) {
				res = Integer.compare(o1.getPrice(), o2.getPrice());
				if (res == 0) {
					res = Integer.compare(o1.getMemory(), o2.getMemory());
				}
			}
		}
		return desc ? -res : res;
	}
	
}

//----------------------------------------------------------------------------------------------------------


import java.util.*;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		Set<Phone> set = 
				new TreeSet<>(new PhoneComparatorByDiagonal());
		
		set.add(new Phone("7", 400, 32, 4.8));
		set.add(new Phone("galaxy s6", 300, 32, 4.7));
		set.add(new Phone("galaxy s6", 300, 64, 4.7));
		set.add(new Phone("7 plus", 500, 32, 5.7));
		set.add(new Phone("galaxy s9+", 900, 64, 5.0));
		set.add(new Phone("galaxy s9+", 1000, 128, 5.0));
//		set.forEach(System.out::println);
		
		List<Phone> list = new ArrayList<>();
		list.addAll(set);
		list.add(new Phone("X", 1000, 32, 5.1));
		list.add(new Phone("galaxy s9", 1000, 128, 5.0));
		
//		Collections.sort(list, new PhoneComparatorByDiagonal());
//		list.sort(null);
//		list.sort(new PhoneComparatorByDiagonal(true));
		
		List<String> strs = list.stream()
				.filter(e -> e.getPrice() < 600)
				.map(e -> e.getModel() + " " + e.getMemory() + "gb" + 
						" '" + e.getDiagonal() + " $" + e.getPrice())
				.collect(Collectors.toList());
		
		strs.forEach(System.out::println);
		
		list.forEach(System.out::println);
	}
}

