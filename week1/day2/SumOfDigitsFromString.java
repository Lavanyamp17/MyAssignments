package week1.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		
		String text = "Tes12Le79af65";
		int sum = 0;
		String replaceAll = text.replaceAll("\\D", "");
		char[] charArray = replaceAll.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			int numericValue = Character.getNumericValue(charArray[i]);
			sum = sum + numericValue;
			System.out.println(sum);
		}
		System.out.println("The sum is : "+sum);
	}

}
