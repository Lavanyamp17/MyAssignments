package week1.day2;



public class Calculator {

	public int add(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println(sum);
		return sum ;
	}
	public int mul(int i, int j) {
		int res = i*j;
		System.out.println(res);
		return res;
		
	}
	public void sub() {
		System.out.println("No operation");
	}
	public int addition(int num1, int num2) {
		return num1+num2;
	}
}



