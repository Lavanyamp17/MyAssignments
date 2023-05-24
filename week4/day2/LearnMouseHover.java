package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement menMouseEle = driver.findElement(By.linkText("MEN"));
		WebElement womenMouseEle = driver.findElement(By.linkText("WOMEN"));
		
		Actions act = new Actions(driver);
		act.moveToElement(menMouseEle).perform();
		act.moveToElement(womenMouseEle).perform();
		
		
	}

}
