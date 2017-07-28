package ExceptionPractice;

public class ExceptionDemo13 {
	public static void m1() {
		try {

			int firstArg = 10 / 0;
			System.out.println("First Argument: " + firstArg);

		} catch (Exception ex) {
			System.out.println("There is no argument");
		}
		System.out.println("normal excecution");
	}

	public static void main(String[] args) {
		m1();
	}
}
