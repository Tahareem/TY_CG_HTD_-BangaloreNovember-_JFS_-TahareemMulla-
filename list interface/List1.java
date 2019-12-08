
import java.util.ArrayList;
import java.util.List;

public class List1
{
	public static void main(String[] args) {
	    List l1=new ArrayList();
		
		l1.add(0,12);
		l1.add(1, 13);
		l1.add(2, 23);
		l1.add(3, 33);
		System.out.println(l1);
		
		l1.remove(2);
		System.out.println(l1);
		System.out.println(l1.indexOf(33));
		l1.add(33);
		System.out.println(l1);
		System.out.println(l1.lastIndexOf(33));
		System.out.println("=============================");
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));//12
										//13
										//33
										//33
		}
		
		List l2=new ArrayList();
		l2.add(45);
		l2.add(46);
		l2.add(47);
		l2.set(1, 99);
		System.out.println(l2);//[45, 99, 47]
		
		List l3=new ArrayList();
		l3.add(45);
		l3.add(46);
		l3.add(66);
		
		List l4=l3.subList(0,2);//[45, 46]
		System.out.println(l4);
		
		
		
	}
}
