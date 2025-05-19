package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		
		//chrome
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Vimal");
		driver.findElement(By.name("lastname")).sendKeys("Tamilmaran");
		WebElement dayDD = driver.findElement(By.id("day"));
		Select select = new Select(dayDD);
		select.selectByIndex(25);
		WebElement monthDD = driver.findElement(By.id("month"));
		Select select1 = new Select(monthDD);
		select1.selectByVisibleText("Jun");
		WebElement yearDD = driver.findElement(By.id("year"));
		Select select2 = new Select(yearDD);
		select2.selectByValue("1995");
		driver.findElement(By.className("_5k_3")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("mathivimalmaran@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("vimalraj@123");
		driver.findElement(By.name("websubmit")).click();
		driver.close();
	}

}
