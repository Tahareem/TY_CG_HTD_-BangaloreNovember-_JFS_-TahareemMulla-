
public class Person {
	static int age;
	String name;
	
	void personDetails()
	{
		System.out.println("Person name is" +name+ "and age is" +age);
		//personDetails();
	}
	static void personDetailsStatic()
	{
		System.out.println(age);
		//System.out.println(name);
		//personDetails();
	}
}
