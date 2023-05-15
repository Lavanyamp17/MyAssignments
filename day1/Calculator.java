package week3.day1;

public class Calculator {

	public void addNum(int x, int y)
	{
		System.out.println(x+y);
	}
	public void addNum(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	public void multiplyNum(double x, double y) {
		System.out.println("x*y= "+x*y);
	}
	public void multiplyNum(float x, float y) {
		System.out.println("x*y= "+x*y);
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.addNum(10, 20);
		calc.addNum(10, 20, 30);
		calc.multiplyNum(10.22, 20.22);
		calc.multiplyNum(11.5f, 22.5f);
	}

}
