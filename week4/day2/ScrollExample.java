package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ScrollExample {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement scrollEle = driver.findElement(By.xpath("//div[text()='Secure Systems']"));
		
		Actions act = new Actions(driver);
		act.scrollToElement(scrollEle).perform();
	}

}
