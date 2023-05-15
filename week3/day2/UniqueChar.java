package week3.day2;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueChar {

	public static void main(String[] args) {
		
		String companyName = "google";
		String s= "";
		char ch[] = companyName.toCharArray();
		
		Set<String> setStrng = new LinkedHashSet<>();
		
		for (int i = 0; i < ch.length; i++) {
			boolean add = setStrng.add(ch[i]+s);
			
			}
		
		System.out.println(setStrng);
		
		
		
		

	}

}
