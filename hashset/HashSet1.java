import java.util.HashSet;

public class HashSet1
{
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(23);
		hs.add(67);
		hs.add(null);
		hs.add(55);
		hs.add(23);//it allows to add duplicate values but it will not store
		for (Object object : hs) {
			System.out.println(object);
		}
		
		System.out.println("======================");
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("Tannu");
		hs1.add("Annu");
		hs1.add("Priya");
		hs1.add(null);
		hs1.add(null);
		for (String s1 : hs1) 
		{
			System.out.println(s1);
		}
	}
}
