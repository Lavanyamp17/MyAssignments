package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("abc");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//td[1]//a[@class='linktext'])[1]")).click();
		if (driver.getTitle().contains("View Lead | opentaps CRM")) {
			System.out.println("Title is same");
		}else
			System.out.println("Not same");
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement companyName = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		companyName.clear();
		companyName.sendKeys("New TestLeaf Company");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		String newCompanyName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(newCompanyName);
		//driver.close();
		
		
		
		
	}

}
