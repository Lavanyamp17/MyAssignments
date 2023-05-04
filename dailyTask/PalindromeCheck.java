package dailyTask;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		//String s = "A man, a plan, a canal: Panama";
		//String s = "race a car";
		String s = "";
		String s1 = "";
		String rep = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(rep);
		
		char[] ch = rep.toCharArray();
		
		for (int i =ch.length-1; i>=0; i--) {
			
			s1 = s1+ch[i];
		}
		if (rep.equals(s1)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
