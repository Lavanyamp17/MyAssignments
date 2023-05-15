package week3.day1;

public class Automation extends MultipleLanguage implements Language, TestTool  {

	@Override
	public void selenium() {
		System.out.println("Selenium --> TestTool");
		
	}

	@Override
	public void java() {
		System.out.println("Java --> Language");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby --> MultipleLanguage");
		
	}
	public void python()
	{
		System.out.println("Python --> MultipleLanguage");
	}
	
	public static void main(String[] args) {
		
		Automation auto = new Automation();
		auto.selenium();
		auto.java();
		auto.ruby();
		auto.python();

	}
}
