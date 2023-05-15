package week1.day1;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		
		int num = 8;
		boolean primeNum = true;
		
		for (int i = 2; i <num; i++) {
			if ( num%i==0) {
				primeNum = false;
				break;
			}
		}
			if (primeNum) {
				System.out.println("Number is Prime");
			}
			else {
				System.out.println("Number is not Prime");
			}
				
		}
}
