
public class Car extends Vehicle
{
	int cost=30000;
	void carDetails()
	{
		int cost=10000;
		System.out.println("local variable cost "+cost);
		System.out.println("global variable cost "+this.cost);
		System.out.println("super class variable cost "+super.cost);
	}
}
