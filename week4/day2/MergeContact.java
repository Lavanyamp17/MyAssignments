package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifactions");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//table[contains(@class,'dijit dijitReset dijitInline')]/following::a")).click();
		
		System.out.println(driver.getTitle());
		String mergeContactWindowHandle = driver.getWindowHandle();
		System.out.println(mergeContactWindowHandle);
		
		Set<String> fromContact = driver.getWindowHandles();
		System.out.println(fromContact);
		int fromSize = fromContact.size();
		System.out.println(fromSize);
		
		List<String> handlesList = new ArrayList<>(fromContact);
		driver.switchTo().window(handlesList.get(1));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a")).click();
		driver.switchTo().window(mergeContactWindowHandle);
		driver.findElement(By.xpath("(//table[contains(@class,'dijit dijitReset dijitInline')]/following::a)[2]")).click();
		
		Set<String> toContact = driver.getWindowHandles();
		System.out.println(toContact);
		int toSize = toContact.size();
		System.out.println(toSize);
		
		List<String> toContactList = new ArrayList<>(toContact);
		driver.switchTo().window(toContactList.get(1));
		
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[5]")).click();
		driver.switchTo().window(mergeContactWindowHandle);
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("View Contact | opentaps CRM")) {
			System.out.println("Title is same");
		}
		else {
			System.out.println("Title does not match");
		}
		
	}

}
