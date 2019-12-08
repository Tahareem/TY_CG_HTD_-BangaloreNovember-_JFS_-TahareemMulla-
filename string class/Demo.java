
public class Demo 
{
	public static void main(String[] args) {
		String s1="John";
		System.out.println(s1.hashCode());
		
		String s2="Tommy";
		
		s1="Mickel";
		
		String s3="John";
		
		//If the same reference pointing two different objects,then the hashcode will be different
		System.out.println(s1.hashCode());
		
		//If the reference pointing to the same object,then the hashcode value will be same
		System.out.println(s3.hashCode());
		
	}
}
