package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String s = "madam";
		String s1 = "";
		
		char [] a1 = s.toCharArray();
		
		for (int i= a1.length-1; i>=0 ; i--) {
			
		s1=s1+a1[i];
				
		}
				
			if(s.equalsIgnoreCase(s1)) {
				System.out.println("String is Palindrome");
			}
			else
			{
				System.out.println("Not palindrome");
			}
		
		
		

	}

}
