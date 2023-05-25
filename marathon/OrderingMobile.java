package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class OrderingMobile {

	public static void main(String[] args) {
		
//		Instance URL:https://dev70206.service-now.com
//		Username: admin
//		Password: g=Sl+bJvA99D
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		1. Launch ServiceNow application		
		driver.get("https://dev70206.service-now.com");
		
//		2. Login with valid credentials username as admin and password 
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("g=Sl+bJvA99D");
		driver.findElement(By.id("sysverb_login")).click();
		
//		3. Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
		Shadow shad = new Shadow(driver);
		shad.setImplicitWait(10);
		shad.findElementByXPath("//div[@id='all']").click();
		shad.findElementByXPath("//span[text()='Service Catalog']").click();			
		
//		4. Click on  mobiles
		WebElement handleFrame = shad.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(handleFrame);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		
//		5. Select Apple iphone6s
		driver.findElement(By.xpath("//strong[text()='iPhone 6s']")).click();
		
//		6. Update color field to gold and storage field to 128GB
		WebElement colorDropdown = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select colorSelect = new Select(colorDropdown);
		colorSelect.selectByIndex(3);
		
		WebElement storageDropdown = driver.findElement(By.name("IO:32e0886e4f334200086eeed18110c738"));
		Select storageSelect = new Select(storageDropdown);
		storageSelect.selectByIndex(2);
		
//		7. Select  Order now option
		driver.findElement(By.id("oi_order_now_button")).click();
		
//		8. Verify order is placed and copy the request number"
		String text = driver.findElement(By.id("sc_order_status_intro_text")).getText();
		if (text.contains("Thank you")) {
			System.out.println("Order placed");
		}
		else {
			System.out.println("Order not placed");
		}
		String reqNumber = driver.findElement(By.id("requesturl")).getText();
		System.out.println("Order request number : "+reqNumber);
		
	}

}
