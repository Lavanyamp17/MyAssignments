package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonExample {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		
//		1.Load the URL https://www.amazon.in/
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//		2.search as oneplus 9 pro 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		
//		3.Get the price of the first product
		String price = driver.findElement(By.className("a-price-whole")).getText();
		//float productPrice = Float.parseFloat(price);
		String prodPrice = price.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("First product price : " +prodPrice);
		
//		4. Print the number of customer ratings for the first displayed product
		String custRate = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("No. of Customer Ratings : " +custRate);
		
//		5. Click the first text link of the first image
		driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base')]")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> list = new ArrayList<>(windowHandles);
		driver.switchTo().window(list.get(1));
		
//		6. Take a screen shot of the product displayed
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snaps/oneplus.png");
		FileUtils.copyFile(source, destination);
		
//		7. Click 'Add to Cart' button
		driver.findElement(By.id("add-to-cart-button")).click();
		
//		8. Get the cart subtotal and verify if it is correct.
		Thread.sleep(10000);
		String cartTotal = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		String subTotal = cartTotal.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(subTotal);
		if (subTotal.contains(prodPrice)) {
			System.out.println("Price matches");
		}
		else {
			System.out.println("Price does not match");
		}
		
//		9.close the browser
		driver.quit();
	}

}
