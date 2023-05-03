package week1.day2;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = {"abc","cde","klm","ijk","wer"};
		int len=name.length;
		System.out.println(len);
		System.out.println(name[0]);
		Arrays.sort(name);
		for (int i = len-1; i >=0; i--) {
			System.out.println(name[i]);
		}
	}

}
