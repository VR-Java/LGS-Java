import java.io.Serializable;

public class Container<T extends Object & Comparable<T> & Serializable> {
	private T val;
	
	public Container(T val) {
		this.val = val;
	}

	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		this.val = val;
	}
}


//-----------------------------------------------------------------------------------

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Container<String> cont1 = new Container<>("Hello");
		cont1.setVal("world");
		cont1.getVal().length();
		Container<Integer> cont2 = new Container<>(55);
		
		print("Hello");
		print(75);
		print(cont1);
		print(cont2);
		
		List<Integer> ints = Arrays.asList(55, 34, 77, 85);	
		List<Double> doubles = Arrays.asList(55.0, 44.0);	
		List<Number> arr1 = new ArrayList<>();
		copyAll(ints, arr1);
		copyAll(doubles, arr1);
		System.out.println(arr1);
//		List<Object> arr2 = Arrays.asList(55, 34.0, 77, 85);		
		System.out.println(sum(ints));
		System.out.println(sum(arr1));
		
	}
	
	public static <T> void print(T el) {
		System.out.println(el);
	}
	
	public static void print(Container<?> cont) {
		System.out.println(cont.getVal());
	}
	
	public static Double sum(Collection<? extends Number> col) {
		Double sum = 0.0;
		for (Number number : col) {
			sum += number.doubleValue();
		}
		return sum;
	}
	
	public static <T> void copyAll(Collection<? extends T> from, 
			Collection<? super T> to) {
		for (T el : from) {
			to.add(el);
		}
	}
	
	public void test() {
//		List<Object> a = new List<>();
//		List<Object> a1 = new ArrayList<>();
//		List<String> a1 = new ArrayList<String>();
//		List<String> a12 = new ArrayList<Object>();
	}
}

