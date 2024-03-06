package homeworks;

public class MyCalories {
	public static void main(String[] args) {
		int diameter1 = 24;
		int diameter2 = 28;

		int area1 = getAreaCircle(diameter1);
		int area2 = getAreaCircle(diameter2);

		int calories1 = getCalories(area1);
		int calories2 = getCalories(area2);

		if(calories1 > calories2) {
			System.out.println(calories1 - calories2);
		} else {
			System.out.println(calories2 - calories1);
		}
	}

	private static int getAreaCircle(int diameter) {
		double area = diameter * Math.PI;
		return (int)area;
	}

	private static int getCalories(int area) {
		int calPerSm = 40;
		return area * calPerSm;
	}
}
