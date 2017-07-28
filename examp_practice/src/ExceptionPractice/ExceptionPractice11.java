package ExceptionPractice;

public class ExceptionPractice11 {
	// System.exit(0 either in try blok or catch block)
	public static void main(String[] args) {
		try {

			System.exit(0);

			String firstArg = args[0];
			System.out.println("First Argument: " + firstArg);
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("There is no argument");

		} finally {
			System.out.println("Finally gets executed");
		}
	}

}
