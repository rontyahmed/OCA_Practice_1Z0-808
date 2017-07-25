package StringPractice;

public class StringDemo5 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("animals");
		sb.insert(7, "-"); // sb = animals-
		sb.insert(0, "-"); // sb = -animals-
		sb.insert(4, "-"); // sb = -ani-mals
		System.out.println(sb);
	}

}
