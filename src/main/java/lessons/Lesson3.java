package lessons;

import java.util.Arrays;
public class Lesson3 {
	public static void main (String[] arg) {

		// Сдвинуть элементы массива в указанном направлении
		// (влево или вправо)
		// и на указанное число шагов.
		// Освободившееся ячейки заполните нулями.
		// Выводить массив после каждого шага
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
		int step = 3;
		String direction = "end";

//		System.out.println(Arrays.toString(getArray2(array, step, direction)));

		// В массиве найти элементы, которые в нем встречаюься
		// только один раз и вывести их на экран. То есть найти и вывести
		// уникальные элементы

		int[] array2 = {3, 3, 4, 6, 6, 5, 8, 9, 8 , 10, 11, 13, 14};

		System.out.println(Arrays.toString(getUniqArray2(array2)));
	}

public static int[] getUniqArray2(int[] array) {

	int[] uniqArray = new int[array.length];
	int count = 0;
	int count2 = 0;

	for(int i = 0; i < array.length; i++) {
		count2 = 0;
		for(int k = 0; k < array.length; k++) {
			if(array[i] == array[k]) {
				count2++;
			}
		}

		if (count2 == 1) {
			uniqArray[count] = array[i];
			count++;
		}
	}

	return Arrays.copyOfRange(uniqArray, 0, count);
}

	public static int[] getUniqArray(int[] array) {
		Arrays.sort(array);

		int[] uniqArray = new int[array.length];
		int count =0;
		for(int i = 0; i < array.length; i++) {
			if(i == 0 && array[i] != array[i+1]) {
				uniqArray[count] = array[i];
				count++;
			} else if (i == array.length - 1 && array[i] != array[i-1]) {
				uniqArray[count] = array[i];
				count++;
			} else if(i != 0 && array[i] != array[i-1] && array[i] != array[i+1]) {
				uniqArray[count] = array[i];
				count++;
			}
		}

		return uniqArray;
	}

	public static int[] getArray(int[] array, int step, String direction) {
		if(direction == "end") {
			return Arrays.copyOfRange(array, 0, array.length + step);
		} else {
			int[] nullArray = new int[array.length + step];
			System.arraycopy(array, 0, nullArray, step, array.length);

			return nullArray;
		}
	}

	public static int[] getArray2(int[] array, int step, String direction) {
		if(direction == "end") {
			int[] newArr = new int[array.length + step];

			for(int i = 0; i < array.length; i++) {
				newArr[i] = array[i];

				System.out.println(Arrays.toString(newArr));
			}
			return newArr;
		} else {
			int[] newArr = new int[array.length + step];

			for(int i = 0; i < array.length + step; i++) {
				if(i >= step){
					newArr[i] = array[i - step];

					System.out.println(Arrays.toString(newArr));
				}
				System.out.println(Arrays.toString(newArr));
			}

			return newArr;
		}
	}
}
