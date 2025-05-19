package week3.day3.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Wait;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
				
		//Safari get testcase
		SafariDriver driver1 = new SafariDriver();
		driver1.get("https://www.amazon.in/");
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver1.manage().window().maximize();
		driver1.findElement(By.name("field-keywords")).click();
		driver1.findElement(By.name("field-keywords")).sendKeys("Bags for boys");
		Thread.sleep(500);
		driver1.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		WebElement resultText = driver1.findElement(By.xpath("//span[contains(text(),'results for') or contains(text(),'result for')]"));
		System.out.println("total No of Result:" +resultText.getText());
		Thread.sleep(5000);
		driver1.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[7]")).click();
		Thread.sleep(5000);
		driver1.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[8]")).click();
		Thread.sleep(5000);
		driver1.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.linkText("Newest Arrivals")).click();
		Thread.sleep(2000);
		
		WebElement title1=driver1.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'])[1]"));
		System.out.println("Title of the 1st Element :" +title1.getText());
		Thread.sleep(2000);
		WebElement price1=driver1.findElement(By.xpath("(//div[@class='a-row']/a/span)[1]"));
		System.out.println("Current Price & discount: "+price1.getText());
		Thread.sleep(500);
		WebElement mrp=driver1.findElement(By.xpath("(//div[@class='a-section aok-inline-block'])[1]"));
		System.out.println("MRP of the product"+mrp.getText());
		
		String title = driver1.getTitle();
		System.out.println(title);
		//driver1.close();
		driver1.quit();
	}
}
