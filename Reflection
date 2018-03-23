Reflection API

package reflection;

import annotation.RandomNumber;

public class Person {

	private String name;
	public String gender;
	
	@RandomNumber(max = 100, min = 10)
	private int age;

	public Person() {
		
	}
	
	public Person(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

}




------------------------------------------------------------------------------------






package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Person p = new Person("Ivan", "male", 22);
//		
////		Class<?> clazz = p.getClass();
		Class<?> clazz = Person.class;
		
		Object copy = copy(p);  // copy
		System.out.println(copy);
//
//		System.out.println(clazz);
//		
//		for (Field f : clazz.getFields()) {   // shows visible fields only (+ from superClass)
//			System.out.println(f); 
//		}
//		
//		for (Field f : clazz.getDeclaredFields()) {   // shows all fields only (but not from superClass)
//			System.out.println(f); 
//		}
//		
//		// !!! class Object don't have any fields
//		
//		
//		Field f = clazz.getDeclaredField("name");
//		f.setAccessible(true);   // gives Access for private fied
//		System.out.println(f.get(p));
//		
//		Field f2 = clazz.getDeclaredField("age");
//		if (f2.isAccessible()) {
//			System.out.println(f2.get(p));
//		} else {
//			f2.setAccessible(true);   
//			System.out.println(f2.get(p));
//			f2.setAccessible(false);   
//		}
//		
		Field f3 = clazz.getDeclaredField("name");
		if (f3.isAccessible()) {
			f3.set(p, "VASA");
		} else {
			f3.setAccessible(true);   
			f3.set(p, "VASA");
			f3.setAccessible(false);   
		}
		
		System.out.println(p);
		
//		Scanner sc = new Scanner(System.in);
//		Class<?> c = Class.forName(sc.next());
//		Object o = c.newInstance();
//		System.out.println(o);
		
		
		Constructor<?> constr = clazz.getConstructor(String.class, String.class, int.class);  // Constructors - or all constructors, or one, but with all parameters
		Object oo = constr.newInstance("Yra", "male", 12);
		System.out.println(oo);
		
	}
	
	

	public static Object copy(Object o1) throws Exception {    // copy of any object
		Class<?> c1 = o1.getClass();
		Object o2 = c1.newInstance();

		for (Field f : c1.getDeclaredFields()) {
			if (f.isAccessible()) {
				f.set(o2, f.get(o1));
			} else {
				f.setAccessible(true);
				f.set(o2, f.get(o1));
				f.setAccessible(true);
			}
		}
		return o2;
	}
	
}





-----------------------------------------------------------------------------





package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RandomNumber {
	
	int min() default 0;
	int max() default 1;

}




---------------------------------------------------------------------------------




package annotation;

import java.lang.reflect.Field;
import java.util.Random;

public class RandomNumberAnalyzer {
	
	public static void analyze(Object o) throws Exception{
		
		Class<?> c = o.getClass();
		for (Field f : c.getDeclaredFields()) {
			RandomNumber rn = f.getDeclaredAnnotation(RandomNumber.class);
			
			if (rn != null) {
				int age = (rn.min() + new Random().nextInt(rn.max() - rn.min()));
				
				if (f.isAccessible()) {
					f.set(o, age);
				} else {
					f.setAccessible(true);
					f.set(o, age);
					f.setAccessible(true);
				}
			}
		}
	}

}




-----------------------------------------------------------------------------------



package annotation;

import reflection.Person;

public class AnnotationTest {

	public static void main(String[] args) throws Exception {

		Person p = new Person();
		
		RandomNumberAnalyzer.analyze(p);
		
		System.out.println(p);
		
		
	}

}


