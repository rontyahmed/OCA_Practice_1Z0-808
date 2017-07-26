package MethodPractice;

public class PassByReference1 {

	public static void m1(Integer a) {
		a += a;
		System.out.println("inside m1 method a" + a);
	}

	public static void main(String[] args) {

		Integer a = new Integer(10);
		m1(a);
		System.out.println("original a" + a);
	}

}
