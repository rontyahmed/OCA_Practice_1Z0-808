package ExceptionPractice;

public class ExceptionPractice10 {

	public static void main(String[] args) {
		try {
			String firstArg = args[0];
			System.out.println("First Argument: " + firstArg);
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("There is no argument");
		} finally {
			System.out.println("Finally gets executed");
		}

	}

}
