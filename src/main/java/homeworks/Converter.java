package homeworks;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter converter number 2, 8, or 16");

		int converterNum = scanner.nextInt();

		System.out.println("Enter any number");
		int num = scanner.nextInt();

		switch (converterNum) {
			case 2:
				System.out.println(Long.toBinaryString(num));
				break;
			case 8:
				System.out.println(Long.toOctalString(num));
				break;
			case 16:
				System.out.println(Long.toHexString(num));
				break;
			default:
				System.out.println("You add wrong integer");
		}
	}
}
