package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputPage {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("Lavanya");
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys(" India");
		System.out.println("Textbox Enabled:"+driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']")).isEnabled());

		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
		String retrieveMe = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).getAttribute("value");
		System.out.println(retrieveMe);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']")).sendKeys("This is for my practice");
		driver.findElement(By.xpath("(//div[contains(@class,'ql-editor ql-blank')])[1]")).sendKeys("Type text here");
		driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
		String errorText = driver.findElement(By.xpath("//span[text()='Age is mandatory']")).getText();
		System.out.println(errorText);
		driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).click();
		driver.findElement(By.xpath("//input[@id='j_idt106:auto-complete_input']")).sendKeys("Lavanya");
		driver.findElement(By.xpath("//span[@id='j_idt106:auto-complete_panel']//li[3]")).click();
		
		WebElement date = driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']"));
		date.sendKeys("3/30/2015");
		date.sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']")).sendKeys("4");
		
		driver.findElement(By.xpath("//input[@id='j_idt106:slider']")).sendKeys("50");
		System.out.println("Slider moved");
		driver.findElement(By.xpath("//h5[text()='Click and Confirm Keyboard appears']")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ql-editor ql-blank')])[2]")).sendKeys("Test message");
		
	}

}
