package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("email")).sendKeys("testleaf2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.partialLinkText("Find your account and log in.")).click();
		String title1=driver.getTitle();
		System.out.println(title1);
	}	

}
