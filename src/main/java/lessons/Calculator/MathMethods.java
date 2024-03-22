package lessons.Calculator;

public class MathMethods {
	public static Double getAddition(double num1, double num2) {
		return (num1 + num2);
	}

	public static Double getSubtraction(double num1, double num2) {
		return (num1 - num2);
	}

	public static Double getMultiplication(double num1, double num2) {
		return  (num1 * num2);
	}

	public static Double getDivision(double num1, double num2) {
		if(num2 == 0) {
			return null;
		} else {
			return (num1 / num2);
		}
	}
}
