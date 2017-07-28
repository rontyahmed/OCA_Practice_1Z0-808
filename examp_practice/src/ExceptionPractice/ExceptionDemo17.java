package ExceptionPractice;

public class ExceptionDemo17 {
	class NoMoreCarrotsException extends Exception {
	}

	public class Bunny {
		public static void main(String[] args) {
			eatCarrot();// DOES NOT COMPILE
		}

		private static void eatCarrot() throws NoMoreCarrotsException {
		}
	}
}
