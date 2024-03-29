
public class Employee implements Comparable<Employee> {
	int age;
	int salary;
	String name;
	public Employee(int age, int salary, String name) {
		super();
		this.age = age;
		this.salary = salary;
		this.name = name;
	}
	//@Override
//	public int compareTo(Employee o) {
//		if(this.age>o.age) {
//			return 1;
//		}else if(this.age<o.age) {
//			return -1;
//		}
//		else {
//
//		return 0;
//		}
//	}
//	
//	@Override
//	public int compareTo(Employee o) {
//		if(this.salary>o.salary) {
//			return 1;
//		}else if(this.salary<o.salary) {
//			return -1;
//		}
//		else {
//
//		return 0;
//		}
//	}
	
	
	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
	
	
}
