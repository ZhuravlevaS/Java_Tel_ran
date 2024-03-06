package lessons;

import java.util.Arrays;

public class Lesson4 {
	public static void main(String[] args) {
		int[] array1 = {0, 1, 2};
		int array2[] = {0, 1, 2};
		int array3[] = new int[3];
		int[] array4 = new int[3];


		System.out.println();
	}

	private static boolean isEqualArrays(int[] array1,int[] array2) {
		return Arrays.equals(array1, array2);
	}

	private static boolean isEqualArrays2(int[] array1,int[] array2) {
		if(array1.length != array2.length) {
			return false;
		} else {
			int countNotEqual = 0;

			for (int i = 0; i < array1.length; i++) {
				if(array1[i] != array2[i]) {
					countNotEqual++;
					break;
				}
			}
			return countNotEqual > 0 ? false : true;
		}

	}
}

