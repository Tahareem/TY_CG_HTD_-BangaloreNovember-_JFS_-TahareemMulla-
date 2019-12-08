import java.util.HashSet;

public class StuHashSet2 {
	public static void main(String[] args) {
		HashSet<Student> h1=new HashSet<Student>();
		h1.add(new Student(22,"Annu"));
		h1.add(new Student(23,"Tannu"));
		h1.add(new Student(22,"Annu"));
		h1.add(new Student(24,"Raj"));
		h1.add(new Student(23,"Tannu"));
		
		for (Student s1 : h1) {
			System.out.println(s1.stuName + " and age is " +s1.stuAge);
			
		}
		
	}
}
