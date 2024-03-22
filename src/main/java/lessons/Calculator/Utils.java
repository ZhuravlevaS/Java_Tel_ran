package lessons.Calculator;

import java.util.Scanner;

public class Utils {
	private static boolean isDivision = false;
	private static Scanner scanner = new Scanner(System.in);
	public static char getSign() {
		System.out.println("Enter sign");
		return scanner.next().charAt(0);
	}

	public static double getNumber() {
		System.out.println("Enter number");
		return scanner.nextDouble();
	}

	public static Double getResult(double num1, double num2, char sign) {
		switch (sign){
			case Constants.minus:
				return MathMethods.getSubtraction(num1, num2);
			case Constants.plus:
				return MathMethods.getAddition(num1,num2);
			case Constants.division:
				isDivision = true;
				return MathMethods.getDivision(num1, num2);
			case Constants.multiplication:
				return MathMethods.getMultiplication(num1, num2);
			default:
				return null;
		}
	}
	public static void printResult(double num1, double num2, char sign) {
		Double result = getResult( num1,num2,  sign);
		if(result != null) {
			System.out.printf("%.2f %s %.2f = %.2f", num1, sign, num2, result);
		} else {
			if (isDivision) {
				System.out.println("На ноль делить нельзы");
			} else {
				System.out.println("Неверный знак операции");
			}
		}
	}
}
