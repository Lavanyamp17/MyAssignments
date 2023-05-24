package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafGroundWindowExample {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		String parentWindow = driver.getWindowHandle();
		String parentTitle = driver.getTitle();
		System.out.println("Parent Window Title: "+parentTitle);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		
		List<String> list = new ArrayList<>(windowHandles);
		driver.switchTo().window(list.get(1));
		String childTitle = driver.getTitle();
		System.out.println("Child Window Title: "+childTitle);
		if (!parentTitle.equals(childTitle)) {
			System.out.println("Confirming the control moved to child window");
		}
		else {
			System.out.println("Control is still in parent window");
		}
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> openMultipleHandle = driver.getWindowHandles();
		System.out.println("No of Tabs opened: "+openMultipleHandle.size());
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> closeWindowsHandle = driver.getWindowHandles();
		System.out.println("Total Windows opened: "+closeWindowsHandle.size());
		Thread.sleep(3000);
		List<String> closeWindowsList = new ArrayList<>(closeWindowsHandle);
		for (String eachHandle : closeWindowsList) {
			if (!eachHandle.equals(parentWindow)) {
				driver.switchTo().window(eachHandle).close();
			}
			
		}
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
	}

}
