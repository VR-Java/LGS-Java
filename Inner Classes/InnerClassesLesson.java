
public class Car {
	private String make;
	private String model;
	private int year;
	private double capacity;
	private String body;
	
	public Car(String make, String model, int year, double capacity, String body) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.capacity = capacity;
		this.body = body;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", capacity=" + capacity + ", body=" + body
				+ "]";
	}
	
	private Car() {
		
	}
	
	public static class Builder {
		private Car car = new Car();
		
		public Builder make(String make) {
			car.make = make;
			return this;
		}
		
		public Builder model(String model) {
			car.model = model;
			return this;
		}
		
		public Builder year(int year) {
			car.year = year;
			return this;
		}
		
		public Builder capacity(double capacity) {
			car.capacity = capacity;
			return this;
		}
		
		public Builder body(String body) {
			car.body = body;
			return this;
		}
		
		public Car build() {
			return car;
		}
	}
}



//----------------------------------------------------------------------------------------


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person {
	private String name;
	private int age;
	private List<Pet> pets;
	
	public static class ComparatorByName implements Comparator<Person> {
		public int compare(Person p1, Person p2) {
			int res = p1.name.compareToIgnoreCase(p2.name);
			if (res == 0) {
				res = p1.age - p2.age;
			}
			return res;
		}
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.pets = new ArrayList<>();
	}
	
	public Pet createPet(String nick) {
		Pet pet = new Pet(nick);
		pets.add(pet);
		return pet;
	}
	
	public void printPets() {
		pets.forEach(p -> System.out.println(name + " " + p));
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public class Pet {
		private String nick;
		private int age;
		
		private Pet(String nick) {
			this.nick = nick;
			this.age = -100;
		}
		
		public void printAges(int age) {
			System.out.println("age= " + age);
			System.out.println("this.age= " + this.age);
			System.out.println("Person.this.age= " + Person.this.age);
		}
		
		public void introduce() {
			System.out.println(nick + " is a pet of " + name);
		}

		public String getNick() {
			return nick;
		}

		public void setNick(String nick) {
			this.nick = nick;
		}

		@Override
		public String toString() {
			return "Pet [nick=" + nick + "]";
		}
	}
}



//------------------------------------------------------------------------------



import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		Comparator<Person> comp = new Comparator<Person>() {
			public int compare(Person o1, Person o2) {
				int res = Integer.compare(o1.getAge(), o2.getAge());
				if (res == 0) {
					res = o1.getName().compareToIgnoreCase(o2.getName());
				}
				return res;
			}
		};
		
		Set<Person> persons = 
//				new TreeSet<>(new Person.ComparatorByName());
				new TreeSet<>((p1, p2) -> {
					int res = Integer.compare(p1.getAge(), p2.getAge());
					if (res == 0) {
						res = p1.getName().compareToIgnoreCase(p2.getName());
					}
					return res;
				});
		
		
		
		Person person = new Person("Ivan", 44);
//		Person.Pet pet = person.new Pet("Barsik");
		Person.Pet pet = person.createPet("Barsik");
		Person.Pet pet1 = person.createPet("Tuzik");
		Person.Pet pet2 = person.createPet("Pushok");
		pet.printAges(25);
		person.printPets();
//		pet.introduce();
	}
	
	public void localCar() {
		class Car {
			private String make;

			public Car(String make) {
				super();
				this.make = make;
			}

			public String getMake() {
				return make;
			}

			public void setMake(String make) {
				this.make = make;
			}

			@Override
			public String toString() {
				return "Car [make=" + make + "]";
			}
		}
		
		Car car = new Car("Audi");
		
	}

}


//-------------------------------------------------------------------------------------


public class CarBuilderExample {

	public static void main(String[] args) {
		Car car = new Car.Builder().year(2011)
									.body("Sedan")
									.make("Audi")
									.model("a8")
									.build();
		System.out.println(car);
	}

}



