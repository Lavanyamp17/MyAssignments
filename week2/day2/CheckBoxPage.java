package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPage {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt89']/div[2]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']/div[2]")).click();
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		driver.findElement(By.xpath("//label[text()='C-Sharp']")).click();
		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
		System.out.println(driver.findElement(By.xpath("//p[text()='State = 2']")).getText());
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).click();
		System.out.println("Checkbox disabled: "+driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isEnabled());
		driver.findElement(By.id("j_idt87:multiple")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
		
		driver.close();
	}

}
