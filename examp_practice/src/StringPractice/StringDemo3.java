package StringPractice;

public class StringDemo3 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("animals");
		sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		int len = sb.length();
		char ch = sb.charAt(6);
		System.out.println(" " + len + " " + ch);
	}

}
