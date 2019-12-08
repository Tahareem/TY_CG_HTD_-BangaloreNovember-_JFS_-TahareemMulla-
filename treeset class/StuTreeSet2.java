import java.util.Iterator;
import java.util.TreeSet;

public class StuTreeSet2 {
	public static void main(String[] args) {
		TreeSet<Student> t1=new TreeSet<Student>();
		t1.add(new Student(22,"John"));
		t1.add(new Student(45,"Raj"));
		t1.add(new Student(16,"Annu"));
		t1.add(new Student(22,"John"));
		
		Iterator<Student> itr=t1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
