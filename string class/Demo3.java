
public class Demo3
{
	public static void main(String[] args)
	{
		String s1="John";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.length());
		
		String s2="   Hello   World    ";
		System.out.println(s2.trim());
		
		System.out.println(s1.substring(3));
		
		String s3="ShreeShree";
		System.out.println(s3.substring(3, 7));
		
		System.out.println(s3.isEmpty());
		
		System.out.println(s3.charAt(5));
		
		System.out.println(s3.indexOf(s1));
	}
}
