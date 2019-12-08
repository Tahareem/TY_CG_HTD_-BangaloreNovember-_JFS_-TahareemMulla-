import java.util.HashSet;

public class PerHashSet3 {
	public static void main(String[] args) {
		HashSet<Person> h1=new HashSet<Person>();
		h1.add(new Person(22,"Tannu"));
		h1.add(new Person(23,"annu"));
		h1.add(new Person(22,"Tannu"));
		h1.add(new Person(24,"seema"));
		
		for (Person person : h1) {
			System.out.println(person);
		}
		
	}
	
}
