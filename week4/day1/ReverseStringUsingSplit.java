package week4.day1;

public class ReverseStringUsingSplit {

	public static void main(String[] args) {
		
		String input = "Amazon development centre, Chennai";
		input = input.replace(",", "replace");
		input = input.toLowerCase();
		
		String[] split = input.split(" ");
				
		System.out.println(split.length);
		
		for (int i = split.length-1; i>=0; i--) {
			System.out.println(split[i]);
		}
		
		/*
		 * String text = "TestLeaf"; String substring2 = text.substring(4);
		 * System.out.println(substring2); String substring = text.substring(4, 7);
		 * System.out.println(substring);
		 */
		
	}

}
