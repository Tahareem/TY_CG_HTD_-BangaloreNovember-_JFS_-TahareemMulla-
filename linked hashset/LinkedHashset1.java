import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset1 {
	public static void main(String[] args) {
		LinkedHashSet l1=new LinkedHashSet();
		l1.add(34);
		l1.add(55);
		l1.add(67);
		l1.add(34);
		l1.add(null);
		
		Iterator itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
