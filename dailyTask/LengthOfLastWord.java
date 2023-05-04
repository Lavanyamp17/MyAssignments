package dailyTask;

public class LengthOfLastWord {

	public static void main(String[] args) {
		
		String s = "luffy is still joyboy";
		String[] split = s.split(" ");
		int len = split.length;
		String string = split[len-1];
		System.out.println(string.length());
		

	}

}
