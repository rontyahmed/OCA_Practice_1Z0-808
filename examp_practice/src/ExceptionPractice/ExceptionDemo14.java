package ExceptionPractice;

public class ExceptionDemo14 {

	public static void main(String[] args) {
		try {
			 
		    String firstArg = args[0];
		    System.out.println("First Argument: " + firstArg);
		 
		} 
		finally {
		    System.out.println("Finally gets executed");
		}catch (IndexOutOfBoundsException ex) {
		    System.out.println("There is no argument");
		 
		    System.exit(0);
		 
		} 
	}

}
