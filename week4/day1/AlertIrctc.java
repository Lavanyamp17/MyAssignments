package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertIrctc {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
				
//		a)Launch the browser
		ChromeDriver driver = new ChromeDriver(opt);
		
//		b)Load the url https://www.irctc.co.in/nget/train-search
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		c)Enter MS in ‘From’ textbox
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8 ')]")).sendKeys("MS");
		driver.findElement(By.xpath("//span[text()='CHENNAI EGMORE - MS']")).click();
		
//		d)Enter Cape in ‘To’ textbox
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-9')]")).sendKeys("Cape");
		driver.findElement(By.xpath("//span[text()='KANYAKUMARI - CAPE']")).click();
		
//		e)Click search button 
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
//		f)Click refresh button
		driver.findElement(By.xpath("//div[text()=' Refresh ']")).click();
		
//		g)Click WL and Click BookNow button
		driver.findElement(By.xpath("//strong[contains(text(),'WL')]")).click();
		driver.findElement(By.xpath("//button[text()=' Book Now ']")).click();
		
//		e)Click No button in the alert
		driver.findElement(By.xpath("//span[text()='No']")).click();
		
		
	}

}


