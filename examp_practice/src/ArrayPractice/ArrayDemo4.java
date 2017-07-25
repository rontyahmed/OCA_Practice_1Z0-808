package ArrayPractice;

import java.util.Arrays;

public class ArrayDemo4 {

	public static void main(String[] args) {
		int[] number = { 10, 20, 30 };
		Arrays.sort(number);
		for (int num : number) {
			System.out.println(num);
		}
		// problem is that String sorts in alphabetic order,
		// and 1 sorts before 9.
		String[] number1 = { "20", "10", "70", "90" };
		Arrays.sort(number1);
		for (String s : number1) {
			System.out.println(s);
		}

		// Numbers sort before
		// letters and uppercase sorts before lowercase,
		// in case you were wondering
	}

}
