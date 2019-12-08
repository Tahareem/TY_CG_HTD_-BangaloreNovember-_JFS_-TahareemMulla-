import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		t1.add(22);
		t1.add(45);
		t1.add(87);
		t1.add(12);
		t1.add(45);
	    
		
		//t1.add("cat");//ClassCastException
		//t1.add(null);//NullPointerException
		
		
		t1.remove(22);//only one remove(object) method is present
		
		for (Object o1 : t1) {
			System.out.println(o1);
		}
	}

}
