
public class Demo4Main 
{
	public static void main(String[] args) {
		Demo4 d1=new Demo4("Tannu",22);
		System.out.println(d1.hashCode());
		
		d1=new Demo4("Annu",23);
		System.out.println(d1.hashCode());
		
		int age=d1.getAge();
		String name=d1.getName();
		 
		System.out.println(age);
		System.out.println(name);
	}
}
