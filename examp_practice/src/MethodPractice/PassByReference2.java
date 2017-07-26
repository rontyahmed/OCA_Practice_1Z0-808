package MethodPractice;

public class PassByReference2 {
	public static void m1(Integer[] a) {
		System.out.println("inside m1 method a" + a[0]);
		a[0]=15;
	}

	public static void main(String[] args) {

		Integer[] a = new Integer[]{10,20};
		
		m1(a);
		System.out.println("original a"+a[0]);
	}
}
