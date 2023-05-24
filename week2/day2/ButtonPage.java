package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonPage {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		boolean enabled = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		if (enabled==true) {
			System.out.println("Button is enabled");
		}else
			System.out.println("Button is disabled");
		Point buttonLocation = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")).getLocation();
		System.out.println(buttonLocation);
		String buttonColor = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("color");
		System.out.println(buttonColor);
		Dimension buttonSize = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize();
		System.out.println(buttonSize);
		
		WebElement mouseElement = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']"));
		Actions act = new Actions(driver);
		act.moveToElement(mouseElement).perform();
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt102:imageBtn']")).click();
		
	}

}
