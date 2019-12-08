import java.util.Vector;

public class Vector3 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.addElement(34);
		v1.addElement(56);
		v1.addElement(45);
		v1.add(78);
		System.out.println(v1);
		
		v1.removeElement(new Integer(45));
		System.out.println(v1);
		
		v1.removeElementAt(2);
		System.out.println(v1);
		
		Object i1[]=new Object[v1.size()];
		
		v1.copyInto(i1);//convert collection type to array type
		
		System.out.println("==========for loop==========");
		
		for(int i=0;i<i1.length;i++) {
			System.out.println(i1[i]);
		}
		v1.removeAllElements();
		System.out.println(v1);
		
		
		
		
		
		
		
		System.out.println("==================================");
		Vector v2=new Vector();
		v2.add(46);
		v2.add(67);
		System.out.println(v2.size());//2
		System.out.println(v2.capacity());//10
		v2.trimToSize();
		System.out.println(v2.size());//2
		System.out.println(v2.capacity());//2
		//if ensure capacity > size
		v2.ensureCapacity(6);
		v2.setSize(8);
		System.out.println(v2.size());//8
		System.out.println(v2.capacity());//12//if size is greater than ensurecapacity,then the capacity will become double of the original ensure capacity
		System.out.println(v2);
		
		
	}
}
