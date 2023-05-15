package org.system;

public class Desktop extends Computer{
	
	public void desktopSize()
	{
		System.out.println("Size of Desktop");
	}
	public static void main(String[] args) {
		
		Desktop dp = new Desktop();
		dp.desktopSize();
		dp.computerModel();

	}

}
