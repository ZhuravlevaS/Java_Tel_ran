package lessons;

import java.util.Arrays;

public class Lesson6 {
	public static void main(String[] args) {

//		Создать программу, выводящую на экран случайно сгенерированное
//		трёхзначное натуральное число и его наибольшую цифру.
//				Например: 398
//				Выход: 9
		int num = 547;
		sortNumbers();
	}

	private static void getMaxNum(int num){
		int n_last = num % 10; // 7
		int n_first = num / 100; // 8
		int n_middle = num / 10 % 10; // 9

		System.out.println(n_first + " " + n_middle + " " + n_last);
	}

	private static void getMaxNum2(int num){
		String number = "" + num;
		char[] charArray = number.toCharArray();
		Arrays.sort(charArray);



		System.out.println(charArray[charArray.length-1]);
	}

	private static void sortNumbers() {
		int a = 4;
		int b = 7;
		int c = 3;
		int[] numArray = {a, b, c};
		Arrays.sort(numArray);

		a = numArray[0];
		b = numArray[1];
		c = numArray[2];

		System.out.println(a + " " + b + " " + c);
	}
}
