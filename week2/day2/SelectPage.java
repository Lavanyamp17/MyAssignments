package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectPage {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement dd1 = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		
		Select sec1 = new Select(dd1);
		sec1.selectByIndex(1);
		
		
		driver.findElement(By.id("j_idt87:country_label")).click();
		driver.findElement(By.id("j_idt87:country_3")).click();
		driver.findElement(By.xpath("//label[@id='j_idt87:city_label']")).click();
		//driver.findElement(By.xpath("//li[@id='j_idt87:city_2']")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:auto-complete']//button")).click();
		driver.findElement(By.xpath("//span[@id='j_idt87:auto-complete_panel']//li[text()='Selenium WebDriver']")).click();
		driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']")).click();
		driver.findElement(By.xpath("//li[text()='Tamil']/ancestor::div")).click();
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='j_idt87:value_2']/ancestor::div")).click();

		

	}

}
