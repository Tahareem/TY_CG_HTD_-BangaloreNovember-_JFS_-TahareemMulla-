import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList2 
{
	public static void main(String[] args) {
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Apple");
		a2.add("Cat");
		a2.add("Dog");
		System.out.println(a2);
		//a2.remove(1);
		//System.out.println(a2);
		
		System.out.println(a2.lastIndexOf("Dog"));
		
		System.out.println("=============addAll()===========");
		ArrayList<String> a3=new ArrayList<String>();
		a3.add("Fruit");
		a3.add("Veg");
		a3.add("Sweets");
		System.out.println(a3);
		a3.addAll(1, a2);
		System.out.println(a3);
		
		System.out.println("====================set()===============");
		ArrayList<String> a4=new ArrayList<String>();
		a4.add("Lion");
		a4.add("Tiger");
		a4.add("Cheetah");
		a4.set(1, "Monkey");
		System.out.println(a4);
		
		
	
		
		System.out.println("==============get()===================");
		for(int i=0;i<a2.size();i++)
		{
			System.out.println(a2.get(i));
		}
		
		System.out.println("==============foreach loop============");
		for(String s2:a2)
		{
			System.out.println(s2);
		}
		System.out.println("================iterator method==================");
		Iterator<String> itr=a2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("============list iterator======================");
		ListIterator<String> itr2=a2.listIterator(a2.size());
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
	}
}
