import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(45);
		v1.add(23);
		v1.add(67);
		v1.add(58);
		
		System.out.println(v1);
		v1.set(1, 69);
		System.out.println(v1);
		v1.remove(new Integer(67));
		System.out.println(v1);
		
		System.out.println("==========for loop=============");
		for(int i=0;i<v1.size();i++) {
			System.out.println(v1.get(i));
		}
	}
}
