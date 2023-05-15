package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFindPrice {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles", Keys.ENTER);
		List<WebElement> priceList = driver.findElements(By.className("a-price-whole"));
		
		List<Integer> list = new ArrayList<>();
		
		for (WebElement each : priceList) {
			String text = each.getText();
//			System.out.println(text);
			String replaceAll = text.replaceAll(",", "");
			if (!replaceAll.isEmpty()) {
				int parseInt = Integer.parseInt(replaceAll);
				list.add(parseInt);
			}
//			if (replaceAll!="") {
//				int parseInt = Integer.parseInt(replaceAll);
//				list.add(parseInt);
//			}
			
		}
		System.out.println(list);
		int size = list.size();
		System.out.println("Size of the list: " +size);
		Collections.sort(list);
		//System.out.println(list);
		System.out.println("Least Mobile Price : " +list.get(0));
	}

}
