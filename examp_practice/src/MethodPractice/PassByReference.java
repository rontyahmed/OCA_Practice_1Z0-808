package MethodPractice;

public class PassByReference {

	public static void m1(String name) {
		name += name;
		System.out.println("inside m1 method" + name);
	}

	public static void main(String[] args) {
		String nameOriginal = new String("senthamil");
		// String nameOriginal = "senthamil";
		m1(nameOriginal);
		System.out.println("original name" + nameOriginal);
	}

}
