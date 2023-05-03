package week1.day2;

public class LengthOfLastWord {

	public static void main(String[] args) {
		
		String s = "luffy is still joyboy";
		String[] sp = s.split(" ");
		int length = sp.length;
		String string = sp[length-1];
		System.out.println(string.length());
		
		
	}

}
