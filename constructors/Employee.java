
public class Employee 
{
	String empname;
	int empage;
	double empsal;
	Employee(String name,int age,double sal)
	{
		empname=name;
		empage=age;
		empsal=sal;
	}
	void details()
	{
		System.out.println("name: " +empname+" age:" +empage+" salary"  +empsal);
	}
}
