package ArrayPractice;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 2;
		numbers[1] = 3;
		numbers[2] = 9;
		Arrays.sort(numbers);
		for(int num:numbers)
		{
			System.out.println(num);
		}

	}

}
