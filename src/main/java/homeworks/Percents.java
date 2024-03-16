package homeworks;

import java.util.Arrays;
import java.util.Random;

public class Percents {
	public static void main(String[] args) {
		int[] array = new int[100];
		Random rnd = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(-100, 100);
		}

		System.out.println(Arrays.toString(array));

		int nulls = getValueNulls(array);
		int nullsPercentage = getPercentage(array.length, nulls);
		System.out.println("Процент нулей в массиве: " + nullsPercentage + "%");

		int oddNumbers = getValueOddNumbers(array);
		int oddNumbersPercentage = getPercentage(array.length, oddNumbers);
		System.out.println("Процент нечетных чисел в массиве: " + oddNumbersPercentage + "%");

		int evenNumbers = getValueEvenNumbers(array);
		int evenNumbersPercentage = getPercentage(array.length, evenNumbers);
		System.out.println("Процент четных чисел в массиве: " + evenNumbersPercentage + "%");

		int positiveNumbers = getValuePositiveNumbers(array);
		int positiveNumbersPercentage = getPercentage(array.length, positiveNumbers);
		System.out.println("Процент положительных чисел в массиве: " + positiveNumbersPercentage + "%");

		int negativeNumbers = getValueNegativeNumbers(array);
		int negativeNumbersPercentage = getPercentage(array.length, negativeNumbers);
		System.out.println("Процент отрицательных чисел в массиве: " + negativeNumbersPercentage + "%");
	}

	private static int getValueNegativeNumbers(int[] array) {
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if(array[i] < 0) {
				count++;
			}
		}

		return count;
	}
	private static int getValuePositiveNumbers(int[] array) {
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if(array[i] > 0) {
				count++;
			}
		}

		return count;
	}

	private static int getValueEvenNumbers(int[] array) {
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if(array[i] != 0 && array[i] % 2 == 0) {
				count++;
			}
		}

		return count;
	}

	private static int getValueNulls(int[] array) {
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if(array[i] == 0) {
				count++;
			}
		}

		return count;
	}

	private static int getValueOddNumbers(int[] array) {
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if(array[i] != 0 && Math.abs(array[i]) % 2 > 0) {
				count++;
			}
		}

		return count;
	}


	private static int getPercentage(int arrayLength, int numberElements) {
		int onePercent = arrayLength/100;
		return  numberElements/onePercent;
	}
}
