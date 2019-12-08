import java.util.ArrayList;
import java.util.Collection;

public class Collection2
{
	public static void main(String[] args) {
       Collection c1=new ArrayList();
		
		
		//adding an element to collection
		c1.add("Tannu");
		System.out.println(c1);
		
		
		//remove the ele from collection
		c1.remove("Tannu");
		System.out.println(c1);
		
		
		//find size of collection
		System.out.println(c1.size());
		
		//checking collection is empty or not
		System.out.println(c1.isEmpty());
		c1.add(12);
		
		//checking whether object  contains in collection or not
		System.out.println(c1.contains("Tannu"));
		
	}
}
