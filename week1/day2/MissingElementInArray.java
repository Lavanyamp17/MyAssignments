package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int []arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int missNum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			missNum = i+1;
			if (arr[i]!=missNum) {
				
				System.out.println(missNum);
				break;
			}
		}

	}

}
