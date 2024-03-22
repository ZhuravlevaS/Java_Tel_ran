package lessons.Calculator;
public class Calculator {
	static double num1;
	static  double num2;
	static  char sign;
	public static void main(String[] args) {
		sign = Utils.getSign();
		num1 = Utils.getNumber();
		num2 = Utils.getNumber();

		if(sign != Constants.division && sign != Constants.minus && sign != Constants.plus && sign != Constants.multiplication) {
			System.out.println("Что же вы хотите сделать? Так не пойдет.");
		} else {
			Utils.printResult(num1, num2, sign);
		}

	}




}
