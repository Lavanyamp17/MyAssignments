package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("sree@info.in");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String firstLead = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//td[3]//a[@class='linktext'])[1]")).getText();
		System.out.println("FirstLead= "+firstLead);
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//td[3]//a[@class='linktext'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Duplicate Lead | opentaps CRM")) { 
			System.out.println("Confirm Title Same");
		}else
			System.out.println("Not same");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String duplicateLead = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		System.out.println("Duplicate Lead= "+duplicateLead);
		
		if (firstLead.equals(duplicateLead)) {
			System.out.println("Names are same");
		}else
			System.out.println("Names are different");
		Thread.sleep(2000);
		//driver.close();
	}

}
