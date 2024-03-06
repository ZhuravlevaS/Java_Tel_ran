package lessons;

import java.sql.Array;
import java.util.Arrays;

public class Lesson2 {
	public static void main(String[] args) {
//		int[] array1 = new int[10];
//		int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		System.out.println(array2[1]);
//		System.out.println(array2[array2.length - 2]);
//
//		for(int i = 0; i < array2.length; i++) {
//			System.out.print(array2[i]);
//		}
//
//		for (int number: array2) {
//			System.out.print(number);
//		}
//
//		for(int i = 0; i < array2.length; i++) {
//			array2[i] = -1;
//		}

		arrays2();
	}


	public static void arrays(){
		int[] array = {11, 2, 13, 49, 0, 4, 74, 84, 9, 10};
		int min = array[0];
		int minIndex = 0;
		int min1 = Integer.MAX_VALUE;
		int minIndex1 = 0;

		for(int i = 0; i < array.length; i++) {
			if(array[i] <  min) {
				min = array[i];
				minIndex = i;
			}
		}

		for(int i = 0; i < array.length; i++) {
			if(array[i] <=  min1 && i != minIndex) {
				min1 = array[i];
				minIndex1 = i;
			}
		}

		System.out.println(min);
		System.out.println("index " + minIndex);
		System.out.println(min1);
		System.out.println("index1 " + minIndex1);

	}

public static void arrays2(){
	int[] array = {-11, 4, 13, 49, -11, 4, 74, 84, 9, 10};
	int oneMinValue1 = array[0];
	int twoMinValue2 = array[1];

	int indexOneMinValue1 = 0;
	int indexTwoMinValue2 = 1;

	if(oneMinValue1 > twoMinValue2) {
		int tmp = twoMinValue2;
		twoMinValue2 = oneMinValue1;

		indexOneMinValue1 = 1;
		indexTwoMinValue2 = 0;
		oneMinValue1 = tmp;
	}

	for (int i = 0; i < array.length; i++) {
		if (oneMinValue1 > array[i]) {
			twoMinValue2 = oneMinValue1;
			indexTwoMinValue2 = indexOneMinValue1;

			oneMinValue1 = array[i];
			indexOneMinValue1 = i;

		} else if (twoMinValue2 > array[i] && i != indexOneMinValue1){
			twoMinValue2 = array[i];
			indexTwoMinValue2 = i;
		}
	}

	System.out.println(oneMinValue1);
	System.out.println("Index1 " + indexOneMinValue1);

	System.out.println(twoMinValue2);
	System.out.println("Index2 " + indexTwoMinValue2);
	Arrays.sort(array);

	System.out.println(Arrays.toString(array));

}

	public static void arraysModules() {
		int[] array = {11, 2, -13, 49, 5, 2, 74, -84, 9, -10};
		int sum = 0;
		for(int number: array) {
			sum = sum + Math.abs(number);
		}

		System.out.println(sum);
	}
}
