package lessons;

import java.util.Objects;
import java.util.Scanner;

public class Lesson7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("введите ответ");

			String answer = scanner.nextLine();

			if(Objects.deepEquals(answer, "Tроллейбус") || Objects.equals(answer,"троллейбус")) {
				System.out.println("Правильно!");
				break;
			} else if ( Objects.equals(answer,"Сдаюсь") ||  Objects.equals(answer,"cдаюсь")) {
				System.out.println("Правильный ответ: троллейбус");
				break;
			} else {
				System.out.println("Подумай еще.");
			}
		}
	}
}
