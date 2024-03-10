package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Number a");
		int a = scanner.nextInt();

		System.out.println("Number b");
		int b = scanner.nextInt();

		System.out.println("Number c");
		int c = scanner.nextInt();

		sortNumbers(a, b, c);
	}

	private static void sortNumbers(int a, int b, int c) {
		int[] numArray = {a, b, c};
		Arrays.sort(numArray);

		a = numArray[0];
		b = numArray[1];
		c = numArray[2];

		System.out.println(a + " " + b + " " + c);
	}
}
