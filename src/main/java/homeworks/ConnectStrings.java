package homeworks;

import java.util.Scanner;

public class ConnectStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter string 1");
		String str1 = scanner.nextLine();

		System.out.println("Enter string 2");
		String str2 = scanner.nextLine();

		concatStrings(str1, str2);
	}

	private static boolean checkString(String str) {
		if(str.length() % 2 != 0) {
			System.out.println("String \"" + str + "\" has odd length ");
			return false;
		}

		return true;
	}

	private static String getHalfString(String str, String position) {
		switch (position) {
			case "start":
				return str.subSequence(0, str.length()/2).toString();
			case "end":
				return str.subSequence(str.length()/2, str.length()).toString();
			default:
				System.out.println("Что-то пошло не так!");
				return "Что-то пошло не так!";
		}
	}

	private static void concatStrings(String str1, String str2) {
		if(checkString(str1) && checkString(str2)) {
			String halfString1 = getHalfString(str1, "start");
			String halfString2 = getHalfString(str2, "end");

			System.out.println(halfString1.concat(halfString2));
		}
	}

}
