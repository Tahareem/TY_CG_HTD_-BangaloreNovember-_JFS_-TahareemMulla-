import java.util.TreeSet;

public class EmpTreeSet3 {
	public static void main(String[] args) {
		
		EmployeeName e1=new EmployeeName();
		EmployeeAge e2=new EmployeeAge();
		EmployeeSalary e3=new EmployeeSalary();
		TreeSet<Employee> t1=new TreeSet<Employee>(e2);
		t1.add(new Employee(21,34000,"John"));
		t1.add(new Employee(27,44000,"Mikel"));
		t1.add(new Employee(28,14000,"Wick"));
		t1.add(new Employee(43,25000,"Sam"));
		
		for (Employee employee : t1) {
			System.out.println("employee name is "+employee.name);
			System.out.println("employee age is "+employee.age);
			System.out.println("employee sal is "+employee.salary);
			System.out.println("---------------------------------------");
		}
		
	}
}
