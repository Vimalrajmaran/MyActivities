package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AccountCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		
		//chrome
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Naresh");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.id("numberEmployees")).sendKeys("15");
		WebElement industryDP = driver.findElement(By.name("industryEnumId"));
		Select select = new Select(industryDP);
		select.selectByVisibleText("Computer Software");
		//select by visible text
		WebElement ownerDP = driver.findElement(By.name("ownershipEnumId"));
		Select select1 = new Select(ownerDP);
		select1.selectByVisibleText("S-Corporation");
		//select by value
		WebElement  empdp= driver.findElement(By.name("dataSourceId"));
		Select select2 = new Select(empdp);
		select2.selectByValue("LEAD_EMPLOYEE");
		//select by index
		WebElement marketingdP = driver.findElement(By.name("marketingCampaignId"));
		Select select3 = new Select(marketingdP);
		select3.selectByIndex(6);
		//select by value
		WebElement statedp = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select select4 = new Select(statedp);
		select4.selectByValue("TX");
		
		driver.findElement(By.id("officeSiteName")).sendKeys("Leaftaps");
		driver.findElement(By.className("smallSubmit")).click();
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		driver.quit();
	}

}
