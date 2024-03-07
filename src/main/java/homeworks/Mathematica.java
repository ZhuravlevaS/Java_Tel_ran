package homeworks;

import java.util.Scanner;

public class Mathematica {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number 1");
		int num1 = scanner.nextInt();

		System.out.println("Enter number 2");
		int num2 = scanner.nextInt();

		getAddition(num1, num2);
		getSubtraction(num1, num2);
		getMultiplication(num1, num2);
		getDivision(num1, num2);
	}

	private static void getAddition(int num1, int num2) {
		System.out.println("Результат сложения: " + (num1 + num2));
	}

	private static void getSubtraction(int num1, int num2) {
		System.out.println("Результат вычитания: " + (num1 - num2));
	}

	private static void getMultiplication(int num1, int num2) {
		System.out.println("Результат умножения: " + (num1 * num2));
	}

	private static void getDivision(int num1, int num2) {
		System.out.println("Результат деления: " + (num1 / num2));
	}


}
