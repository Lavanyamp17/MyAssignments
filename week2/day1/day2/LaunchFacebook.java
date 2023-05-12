package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchFacebook {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Lavanya");
		driver.findElement(By.name("lastname")).sendKeys("Muthu");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.id("password_step_input")).sendKeys("Password");
		
		WebElement element = driver.findElement(By.id("day"));
		Select sec = new Select(element);
		sec.selectByValue("17");
		
		WebElement element1 = driver.findElement(By.id("month"));
		Select sec1 = new Select(element1);
		sec1.selectByValue("7");
		
		WebElement element2 = driver.findElement(By.id("year"));
		Select sec2 = new Select(element2);
		sec2.selectByVisibleText("1984");
		
		driver.findElement(By.name("sex")).click();
		
	}

}
