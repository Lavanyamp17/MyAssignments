package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("BBB Co");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ccc");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("rrr");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ttt");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("yyy");
		driver.findElement(By.name("description")).sendKeys("Description written here");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hhh@gmail.com");
		
		WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select sec = new Select(element);
		sec.selectByValue("NY");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("This is important note");
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println(driver.getTitle());

	}

}
