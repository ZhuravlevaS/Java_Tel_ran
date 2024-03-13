package lessons;

import java.util.Arrays;
import java.util.Random;

public class Lesson8 {
	public static void main(String[] args) {
		Random random = new Random();
		int arrayLength = 10;
		int[] array = new int[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			array[i] = random.nextInt(11);
		}
		int findElement = 5;
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(findElement + " has index " + recursiveBS(array, 0, arrayLength - 1, findElement));


		int[] arr = {0, -10, 100, 2, 15};
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, 4);
		System.out.println(Arrays.toString(arr));
	}

	public static int recursiveBS(int[] array, int firstIdx, int lastIdx, int findElement) {
		if (lastIdx >= firstIdx) {
			int midIdx = firstIdx + (lastIdx - firstIdx) / 2;
			if (array[midIdx] == findElement) {
				return midIdx;
			}
			if (array[midIdx] > findElement) {
				return recursiveBS(array, firstIdx, midIdx - 1, findElement);
			}
			return recursiveBS(array, midIdx + 1, lastIdx, findElement);
		}
		return -1;
	}

	public static void bubbleSort(int[] array) {
		boolean isSorted = false;
		int tmp;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					tmp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = tmp;
					isSorted = false;
				}
			}
		}
	}

	public static void quickSort(int[] arr, int first, int last) {
		if (last <= first) {
			return;
		}
		int pivot = partition(arr, first, last);
		quickSort(arr, first, pivot - 1);
		quickSort(arr, pivot + 1, last);
	}
	public static int partition(int[] arr, int first, int last) {
		int pivot = last;

		int counter = first;
		for (int i = first; i < last; i++) {
			if(arr[i] < arr[pivot]) {
				int tmp = arr[counter];
				arr[counter] = arr[i];
				arr[i] = tmp;
				counter++;
			}
		}
		int tmp = arr[pivot];
		arr[pivot] = arr[counter];
		arr[counter] = tmp;

		return counter;
	}
}
