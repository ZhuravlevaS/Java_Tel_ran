package lessons;

import java.util.Arrays;
import java.util.Random;

//задание 1
//Создайте массив из 10 случайных целых чисел из интервала [1;50]
//Выведите массив на консоль в строку.
//Замените каждый элемент с нечетным индексом на ноль.
//Полученный массив отсортируйте по возрастанию элементов
//Снова выведете массив на консоль в отдельной строке.
//
//
//задание 2
//Создайте массив из 5 случайных целых чисел из интервала [10;99]
//Выведите его на консоль в строку.
//Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.

//задание 3
//Реализовать соединение любых трех строк  с помощью +, concat, StringBuilder
//Подумать,а как убедиться в том, что конкретно выполняет JVM
// когда исполняет наш код? Возможно ли вообще такое?
//
//Подсказка: вспомните все нюансы работы с языком Java
public class Lesson10 {
	public static void main(String[] args) {
		getTask1();
		getTask2();
	}

	private static int[] getRandomArray(int arrayLength) {
		Random random = new Random();
		int[] array = new int[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			array[i] = random.nextInt(10, 99);
		}
		return array;
	}

	private static void getTask1() {
		int[] array = getRandomArray(10);

		System.out.println(Arrays.toString(array));
		updateArrayIdx(array);
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}

	private static void updateArrayIdx(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if(i % 2 != 0) {
				array[i] = 0;
			}
		}
	}

	private static void getTask2() {
		int[] array = getRandomArray(5);
		System.out.println(Arrays.toString(array));

		boolean isIncreasing = true;
		for (int i = 1; i < array.length; i++) {
			if (array[i] <= array[i - 1]) {
				isIncreasing = false;
				break;
			}
		}
		System.out.println(isIncreasing);
	}

	private static void getTask3() {

	}
}
