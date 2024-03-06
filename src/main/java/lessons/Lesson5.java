package lessons;

import java.util.Arrays;

public class Lesson5 {
	public static void main(String[] args) {
		Animal cat = new Animal(10, "Tortik");
		cat.creatChild(2, "newTortik");

		System.out.println(reverseString("qwert"));
	}

	public static String reverseString(String str) {
		char[] arrayChar = str.toCharArray();

		for (int i = 0; i < arrayChar.length/2; i++) {
			char temp = arrayChar[i];
			arrayChar[i] = arrayChar[arrayChar.length-1-i];
			arrayChar[arrayChar.length-1-i] = temp;
		}

		return String.copyValueOf(arrayChar) ;
	}
}

