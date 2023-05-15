package week3.day1;

public class SmartPhone extends AndroidPhone {
	
	public void takeVideo() {
		System.out.println("SmartPhone class");
	}
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.takeVideo();
		
//		AndroidPhone ap = new AndroidPhone();
//		ap.takeVideo();
	}
}
