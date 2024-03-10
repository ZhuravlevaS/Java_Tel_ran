package homeworks;

import java.util.Scanner;

public class SquareRoots {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Number a");
		int a = scanner.nextInt();

		System.out.println("Number b");
		int b = scanner.nextInt();

		System.out.println("Number c");
		int c = scanner.nextInt();

		int discriminant = getDiscriminant(a, b, c);

		if(discriminant < 0) {
			System.out.println("Нет корней уравнений" );
		} else if (discriminant == 0) {
			System.out.println("Один корень " + getRootsWithOneDisc(b, a));
		} else {
			double[] roots = getRootsWithTwoDisc(discriminant, b, a);
			System.out.println("Два корня" + roots[0] + ", " + roots[1]);
		}

	}

	public static int getDiscriminant(int a, int b, int c) {
			// formula D = b^2 - 4ac

		return (b*b) - (4 * a * c);
	}

	public static int getRootsWithOneDisc(int b, int a) {
		// formula x = -(b/2a)

		return -(b / (2 * a));
	}

	public static double[] getRootsWithTwoDisc(int discriminant, int b, int a){
		// formula (-b + - Math.sqrt(D))/2a

		double[] roots = new double[2];

		double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
		double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

		roots[0] = x1;
		roots[1] = x2;

		return roots;
	}

}
