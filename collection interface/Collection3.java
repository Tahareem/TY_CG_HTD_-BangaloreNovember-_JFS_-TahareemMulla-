import java.util.ArrayList;
import java.util.Collection;

public class Collection3 
{
	public static void main(String[] args) {
		//addAll() method
		Collection c=new ArrayList();
		c.add(12);
		c.add(13);
		System.out.println(c);
		Collection c1=new ArrayList();
		c1.add(21);
		c1.add(22);
		System.out.println(c1);
		c.addAll(c1);
		System.out.println(c);
		
		//removeall()
		System.out.println("===========removeall================");
		Collection c2=new ArrayList();
		c2.add(122);
		c2.add(133);
		System.out.println(c2);
		Collection c3=new ArrayList();
		c3.add(1222);
		c3.add(1333);
		System.out.println(c3);
		c2.removeAll(c3);
		System.out.println(c2);
		
		//retainAll()
		System.out.println("=================retainall==============");
		Collection c4=new ArrayList();
		c4.add(35);
		c4.add(36);
		//System.out.println(c4);
		Collection c5=new ArrayList();
		c5.add(41);
		c5.add(42);
		System.out.println(c5);
		c4.retainAll(c5);
		System.out.println(c4);
		
		//containsAll()
		System.out.println("==================containsAll===============");
		System.out.println(c4.containsAll(c5));
		
		//clear()
		System.out.println(c4);
		c4.clear();
		
		
		//toArray()
		System.out.println("==========toArray=====================");
		Collection c6=new ArrayList();
		c6.add(410);
		c6.add(420);
		
		Object a[]=c6.toArray();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
	}
}
