package marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class AdministratorCertifications {

	public static void main(String[] args) throws IOException {
		
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
		
//		8. Click on first resulting Certificate
		driver.findElement(By.xpath("//div[@class='roleMenu-item_text']")).click();
		
		
//		9. verify - Administrator Overview page
		String title = driver.getTitle();
		if (title.contains("Administrator Overview")) {
			System.out.println("Administrator Overview Page displayed");
		}
		else {
			System.out.println("Overview Page not displayed");
		}
		
//		10.Print the Certifications available for Administrator Certifications (List)
		driver.findElement(By.linkText("Administrator")).click();
		List<WebElement> certificateList = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		for (WebElement each : certificateList) {
			String certi = each.getText();
			System.out.println(certi);
		}
		
//		11. Take a Snapshot
		WebElement snap = driver.findElement(By.xpath("//a[text()='Business Administration Specialist']"));
		act.moveToElement(snap).perform();
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snaps/admincertificate.png");
		FileUtils.copyFile(source, destination);
	}

}
