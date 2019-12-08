import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset2 {
	public static void main(String[] args) {
		LinkedHashSet<String> l2=new LinkedHashSet<String>();
		l2.add("Dog");
		l2.add("Cat");
		l2.add("Lion");
		l2.add(null);
		
		Iterator<String> itr=l2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
