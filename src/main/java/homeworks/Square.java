package homeworks;

public class Square {
	public static void main(String[] args) {
		int height = 10;
		int width = 20;

		printEmptySquare(width, height);
		System.out.println(' ');
		printFilledSquare(width, height);
	}

	private static void printFilledSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print('*');
			}
			System.out.println(' ');
		}
	}

private static void printEmptySquare(int width, int height) {
	for (int i = 0; i < height; i++) {
		for (int j = 0; j < width; j++) {

			if(j == 0 || j == width - 1 ) {
				System.out.print('*');
			} else if (i == 0 || i == height - 1) {
				System.out.print('*');
			}
			 else {
				System.out.print(' ');
			}

		}
		System.out.println(' ');
	}
}
}
