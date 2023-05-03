package week1.day2;

public class ArrayIntExample {

	public static void main(String[] args) {
		
		int num[] = {22,33,44,77,11,99,55};
		int numLength = num.length;
		System.out.println(numLength);
		System.out.println(num[5]);
		
		for (int i = 0; i<numLength; i++) {
			System.out.println(num[i]);
		}
		
		for (int i = num.length-1; i>=0  ; i--) {
			System.out.print(num[i]);
		}
	}

}
