package week1.day2;


public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester"; 
		String sArray[] = test.split(" ");  
		
		
		for (int i = 0; i < sArray.length; i++) {
			String s = "";
			if (i%2!=0) {
				
				char ch[] =	sArray[i].toCharArray();
				
				for (int j = ch.length-1; j>=0; j--) {
					s = s+ch[j];
				}
			System.out.print(s+" ");
			}
		else
		{
			System.out.print(sArray[i]+" ");
		}
		
		}
		
	}
}
