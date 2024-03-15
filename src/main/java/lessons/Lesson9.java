package lessons;

public class Lesson9 {
	public static void main(String[] args) {

		CharSequence charSequence = "baeldung";

		StringBuilder str = new StringBuilder();
		StringBuilder strCapacity = new StringBuilder(18);
		StringBuilder strStr = new StringBuilder("ddd");
		StringBuilder strChar = new StringBuilder(charSequence);

		str.append("StartaUniversity");
		str.append("1StartaUniversity");
		System.out.println(str);
		System.out.println(strCapacity.capacity());
		System.out.println(strStr);
		System.out.println(strChar);
		str.reverse();

		System.out.println(str);
	}
}
