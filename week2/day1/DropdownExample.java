package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CompanyName");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("abc");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("pwd");
		
		
		WebElement element = driver.findElement(By.name("dataSourceId"));
		
		Select sel = new Select(element);
		sel.selectByIndex(4);
		
		WebElement element2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel1 = new Select(element2);
		sel1.selectByVisibleText("Automobile");
		
		WebElement element3 = driver.findElement(By.name("ownershipEnumId"));
		Select sel2 = new Select(element3);
		sel2.selectByValue("OWN_CCORP");
		
		System.out.println(driver.getTitle());		
		
		

	}

}
