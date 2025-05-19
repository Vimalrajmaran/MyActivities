package Week4.day1;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ListAssignment {
	public static void main(String[] args) throws InterruptedException {
		SafariDriver driver = new SafariDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.name("field-keywords")).click();
		driver.findElement(By.name("field-keywords")).sendKeys("Phones",Keys.ENTER);
		Thread.sleep(500);
		//driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		List<WebElement> allprice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> list=new ArrayList<Integer>();
		for(WebElement each : allprice) {
			String text2 = each.getText();
			String replaceAll = text2.replaceAll(",", "");
			int mob=Integer.parseInt(replaceAll);
			list.add(mob);
			
		}
		Collections.sort(list);
		System.out.println(list);
}
}
