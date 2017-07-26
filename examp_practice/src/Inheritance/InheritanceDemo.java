package Inheritance;

class Employee {
	int salary;
	String id;

	public void deisplaySalary() {
		System.out.println("Employee Id  " + id + "  " + "salary  " + salary);
	}

	Employee(int salary, String id) {
		this.salary = salary;
		this.id = id;
	}
}

public class InheritanceDemo extends Employee {
	String companyName;

	InheritanceDemo(int salary, String id, String companyName) {
		super(salary, id);
		this.companyName = companyName;
	}

	public void displayEmployeeDetails() {
		super.deisplaySalary();
		System.out.println("Company Name " + "" + companyName);
	}

	public static void main(String[] args) {
		InheritanceDemo employee1 = new InheritanceDemo(50000, "rcs10", "revature");
		employee1.displayEmployeeDetails();
	}

}
