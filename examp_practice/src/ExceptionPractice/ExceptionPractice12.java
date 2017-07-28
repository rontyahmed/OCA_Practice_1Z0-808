package ExceptionPractice;

public class ExceptionPractice12 {

	public static void main(String[] args) {
		try {
		    String firstArg = args[0];
		    System.out.println("First Argument: " + firstArg);
		} finally {
		    System.out.println("Finally gets executed");
		}
	}

}
