package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPage {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		driver.findElement(By.xpath("//span[text()=' for boys']")).click();
		String text = driver.findElement(By.xpath("//span[text()='1-48 of over 50,000 results for']")).getText();
		String text1 = driver.findElement(By.xpath("//span[text()='\"bags for boys\"']")).getText();
		System.out.println(text+text1);
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[1]")).click();
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[2]")).click();
		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		String text2 = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style'])[1]")).getText();
		System.out.println(text2);
		String text3 = driver.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText();
		System.out.println(text3);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
