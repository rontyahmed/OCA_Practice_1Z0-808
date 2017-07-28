package InterfacePractice;

interface A {
	void m1();
}

interface B {
	void m1();

	void m2();
}

interface C extends A, B {
}

public class InterfaceDemo2 {
	static int a = 10;

	public static void main(String[] args) {
		System.out.println("this is" +a);
	}

}
