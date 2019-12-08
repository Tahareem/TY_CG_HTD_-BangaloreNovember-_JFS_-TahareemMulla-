
public class PersonMain
{
	public static void main(String[] args)
	{
		Person p1=new Person();
		p1.age=22;
		p1.name="John";
		p1.personDetails();
		Person p2=new Person();
		p2.initialize(22,"John");
		p2.personDetails();
		
		
	}
}
