package StringPractice;

public class StringDemo6 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdef");
		sb.delete(1, 3); // sb = adef
		sb.deleteCharAt(5); // throws an exception
		System.out.println(sb);
	}

}
