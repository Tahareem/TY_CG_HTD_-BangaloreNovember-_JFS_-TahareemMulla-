import java.util.Iterator;
import java.util.LinkedHashSet;

public class EmpLinkedHashset3 {
	public static void main(String[] args) {
		LinkedHashSet<Employee> l1=new LinkedHashSet<Employee>();
		l1.add(new Employee(21,"Annu"));
		l1.add(new Employee(22,"Tannu"));
		l1.add(new Employee(23,"sam"));
		l1.add(new Employee(21,"Annu"));
		
		Iterator<Employee> itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
