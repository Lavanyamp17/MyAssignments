package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonPage {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//label[text()='Safari'])[1]")).click();
		driver.findElement(By.xpath("//label[text()='Hyderabad']")).click();
		driver.findElement(By.xpath("//label[text()='Hyderabad']")).click();
		boolean button1 = driver.findElement(By.xpath("//input[@id='j_idt87:console2:0']")).isSelected();
		boolean button2 = driver.findElement(By.xpath("//input[@id='j_idt87:console2:1']")).isSelected();
		driver.findElement(By.xpath("//input[@id='j_idt87:console2:2']")).isSelected();
		if (button1==true) {
			System.out.println("Selected");
		}else if (button2) {
			System.out.println("Selected");
		}else
			System.out.println("Button3 is selected");
	
		if(driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected())
		{
			driver.findElement(By.xpath("//label[text()='1-20 Years']")).click();
		}else
			System.out.println("Default is selected");
	}

}
