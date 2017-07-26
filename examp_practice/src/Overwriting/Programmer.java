package Overwriting;

class Employee {
	int salary;
	String id;

	Employee(int salary, String id) {
		this.salary = salary;
		this.id = id;
	}

	private void displaySalary() {
		System.out.println("Employee Id  " + id + "  " + "salary  " + salary);
	}

	public void displayBonus() {
		System.out.println("bonus details");
	}

}

public class Programmer extends Employee {
	String companyName;

	Programmer(int salary, String id, String companyName) {
		super(salary, id);
		this.companyName = companyName;
	}

	private void displaySalary() {
		System.out.println(
				"Employee Id  " + super.id + "  " + "salary  " + salary + " " + "company Name  " + companyName);
	}

	public void displayBonus() {
		System.out.println("bonus details");
	}

	public static void main(String[] args) {
		Programmer thamil = new Programmer(50000, "10rcs", "revature");
		thamil.displaySalary();
	}

}
