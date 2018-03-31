import java.util.*;

public class Program {
	public static void main(String[] args) {
		 Map<Integer, String> map = new HashMap<>();
//		 map.isEmpty()
//		 map.clear()
//		 map.size()
		 
		 map.put(11, "eleven");
		 map.put(0, "zero");
		 map.put(3, "three");
		 map.put(4, "four");
		 map.put(7, "seven");
		 map.put(2, "two");
		 map.put(7, "7");
		 
//		 Set<Integer> keys = map.keySet();
//		 Iterator<Integer> iter = keys.iterator();
//		 while (iter.hasNext()) {
//			 Integer key = iter.next();
//			 System.out.println(key + " - " + map.get(key));
//		 }
		 
		 Set<Map.Entry<Integer, String>> entries = map.entrySet();
		 Iterator<Map.Entry<Integer, String>> i = entries.iterator();
		 while (i.hasNext()) {
			 Map.Entry<Integer, String> el = i.next();
			 if (el.getKey() % 2 == 0) {
				 i.remove();
			 } else {
				 el.setValue(String.valueOf(el.getKey() * 10));
			 } 
		 }
		 
		 System.out.println(map);
	}
}



//-----------------------------------------------------------------------------------------------



import java.util.*;

public class Program2 {

	public static void main(String[] args) {
		List<Student> group1 = new ArrayList<>();
		group1.add(new Student("Ivan", 22, 48.5, "male"));
		group1.add(new Student("Ihor", 18, 100, "male"));
		group1.add(new Student("Yura", 25, 68.5, "male"));
		group1.add(new Student("Vasa", 22, 78.5, "male"));
		
		List<Student> group2 = new ArrayList<>();
		group2.add(new Student("Ivan", 27, 82.5, "male"));
		group2.add(new Student("Olena", 18, 100, "female"));
		group2.add(new Student("Yura", 25, 68.5, "male"));
		group2.add(new Student("Ira", 22, 48.5, "female"));
		
		List<Student> group3 = new ArrayList<>();
		group3.add(new Student("Andriy", 27, 42.5, "male"));
		group3.add(new Student("Taras", 27, 100, "male"));
		group3.add(new Student("Rostyk", 25, 68.5, "male"));
		
		Map<String, List<Student>> map = new HashMap<>();
		map.put("group1", group1);
		map.put("group2", group2);
		map.put("group3", group3);
		
		Iterator<Map.Entry<String, List<Student>>> i =
				map.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry<String, List<Student>> e = i.next();
			Iterator<Student> listIterator = 
					e.getValue().iterator();
			while (listIterator.hasNext()) {
				Student st = listIterator.next();
				if (st.getRating() > 70) {
					System.out.println(e.getKey() + ", " + st);
				}
			}
		}
		
	}

}


//----------------------------------------------------------------------------------------------



public class Student {
	private String name;
	private int age;
	private double rating;
	private String gender;
	
	public Student(String name, int age, double rating, String gender) {
		this.name = name;
		this.age = age;
		this.rating = rating;
		this.gender = gender;
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

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(rating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rating=" + rating + ", gender=" + gender + "]";
	}
}

