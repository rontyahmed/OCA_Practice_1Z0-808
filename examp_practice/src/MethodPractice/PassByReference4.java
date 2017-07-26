package MethodPractice;

public class PassByReference4 {
	public static void m1(StringBuilder name) {
		name.append(name);
		System.out.println("inside m1 method" + name);
	}

	public static void main(String[] args) {
		StringBuilder nameOriginal = new StringBuilder("senthamil");
		// String nameOriginal = "senthamil";
		m1(nameOriginal);
		System.out.println("original name" + nameOriginal);
	}
}
