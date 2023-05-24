package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class NykaaExample {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		
	    //1) Go to https://www.nykaa.com/
		driver.get("https://www.nykaa.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		String parentWindow = driver.getWindowHandle();
		
		//2) Mouseover on Brands and Search L'Oreal Paris
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));

		Actions action = new Actions(driver);
		action.moveToElement(brands).perform();

		//3) Click L'Oreal Paris		
		driver.findElement(By.xpath("//div[@id='list_topbrands']/following::a[6]")).click();
		
		//4) Check the title contains L'Oreal Paris(Hint-GetTitle)
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("L'Oreal Paris: Buy L'Oreal Paris")) {
			System.out.println("Title matches");
		}
		else {
			System.out.println("Title does not match");
		}

		//5) Click sort By and select customer top rated		
		driver.findElement(By.xpath("//button[@class=' css-1aucgde']")).click();
		driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();

		//6) Click Category and click Hair->Click haircare->Shampoo
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
	    driver.findElement(By.xpath("//div[@class='control-indicator checkbox ']")).click();
		
		
		//7) Click->Concern->Color Protection
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("(//label[@for='checkbox_Color Protection_10764']//div)[2]")).click();
		
		//8)check whether the Filter is applied with Shampoo
		String shampooFilter = driver.findElement(By.xpath("//span[text()='Shampoo']")).getText();

		if (shampooFilter.contains("Shampoo")) {
			System.out.println("Filter is applied with Shampoo");
		}
		else {
			System.out.println("Shampoo not applied in Filters");
		}
		
		//9) Click on L'Oreal Paris Colour Protect Shampoo
		Thread.sleep(3000);
		driver.findElement(By.className("css-xrzmfa")).click();
		
		//10) GO to the new window and select size as 175ml
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("WindowHandlesSize : "+windowHandles.size());
		
		List<String> list = new ArrayList<>(windowHandles);
		driver.switchTo().window(list.get(1));
		
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
			
		//11) Print the MRP of the product
		String price = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
		System.out.println("MRP : "+price);
		
		//12) Click on ADD to BAG
		driver.findElement(By.xpath("//span[@class='btn-text']")).click();
		
		//13) Go to Shopping Bag 
		driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
		
		//14) Print the Grand Total amount
		driver.switchTo().frame(0);
		String grandTotal = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText();
		//String grandTotal = driver.findElement(By.xpath("//span[text()='₹279']")).getText();
		System.out.println("GrandTotal : "+grandTotal);
		
		//15) Click Proceed
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		
		//16) Click on Continue as Guest
		//17) Check if this grand total is the same in step 14
		//18) Close all windows
		
		driver.quit();

	}

}


