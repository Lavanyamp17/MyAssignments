package week1.day2;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {

		String input = "changeme";
		char[] ch = input.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			// to change characters at odd index positions to Upper case (eg : i = 1,3,5,7)
			if (i % 2 != 0) {
				// Character.toUpperCase() method changes character at index position to upper                                                                             case
				ch[i] = Character.toUpperCase(ch[i]);
			}
			System.out.print(ch[i]);

		}
	}
}
