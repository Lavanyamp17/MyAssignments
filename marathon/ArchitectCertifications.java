package marathon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class ArchitectCertifications {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		1. Launch Salesforce application https://login.salesforce.com/
		driver.get("https://login.salesforce.com/");
		
//		2. Login with username as "hari.radhakrishnan@qeagle.com" 
//		    and password as "Leaf@1234"
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		
//		3. Click on Learn More link in Mobile Publisher
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
//		4. Click confirm on Confirm redirect
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList = new ArrayList<>(windowHandles);
		driver.switchTo().window(windowList.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
//		5. Click Learning 
		Shadow shad = new Shadow(driver);
		shad.setImplicitWait(10);
		shad.findElementByXPath("//span[text()='Learning']").click();
		
//		6. And mouse hover on Learning On Trailhead
		Actions act = new Actions(driver);
		WebElement trailHead = shad.findElementByXPath("//span[text()='Learning on Trailhead']");
		//WebElement trailHead = driver.findElement(By.xpath("//span[text()='Learning on Trailhead']"));
		act.moveToElement(trailHead).perform();
		
//		7. Click on Salesforce Certifications
		shad.findElementByXPath("//a[text()='Salesforce Certification']").click();
		
//		7. Choose Your Role as Salesforce Architect
		driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]")).click();
		
//		8. Get the Text(Summary) of Salesforce Architect 
		String summary = driver.findElement(By.xpath("//div[contains(@class,'cert-site_text slds-text-align--center')]")).getText();
		System.out.println(summary);
		
//		9. Get the List of Salesforce Architect Certifications Available
		List<WebElement> certiList = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		for (WebElement each : certiList) {
			String certificate = each.getText();
			System.out.println(certificate);
		}
		
//		10.Click on Application Architect 
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
		
//		11.Get the List of Certifications available
		List<WebElement> architectList = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		for (WebElement each : architectList) {
			String archCertificate = each.getText();
			System.out.println(archCertificate);
		}
		
	}

}
