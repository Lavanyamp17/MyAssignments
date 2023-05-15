package week1.day1;

public class FibonacciExample {

	public static void main(String[] args) {
		
		int firstNum = 0;
		int secNum = 1;
		int sum;
		
		for (int i = 0; i <= 11; i++) {
			//System.out.println(i);
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
		}

	}

}
