package InterfacePractice;

public interface InterfaceDemo1 {

	int NUM = 10;

	void m1();

	public default void m2() {
		System.out.println("default method invoked");
	}

	public static void m3() {
		System.out.println("static method invoked");
	}
}

class Test implements InterfaceDemo1 {
  static int a=10;
	public void m1() {
		System.out.println("m1 method invoked");
	}

	public void m2() {
		System.out.println("child default method invoked");
	}

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(Test.NUM);
		t.m1();
		t.m2();
		InterfaceDemo1.m3();
	}
}
