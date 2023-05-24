package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC Co");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("abc");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("cdd");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("localdee");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("dept");
		driver.findElement(By.name("description")).sendKeys("desc");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		
		WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select sec = new Select(element);
		sec.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		
		
	}

}
