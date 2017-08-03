package ExceptionPractice;

public class ExceptionDemo20 {

	void checkCard(int cardNo) throws Exception {
		System.out.println("Reading Card");
	}

	void readCard(int cardNo) throws RuntimeException {
		System.out.println("Checking Card");
	}

	private boolean f;

	public void display()

	{
		int num = 2;
		while (f) {
			if (num % 7 == 0) {
				f = false;
				System.out.println(num);
				num += 2;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		ExceptionDemo20 e = new ExceptionDemo20();
		e.display();
	}

}
