package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.Select;

public class LeadCreation {

	public static void main(String[] args) {
		/*
		 * Steps to handle the dropdown
		 * 1)identify whether the DD element is present inside the select tag
		 * 2)locate the element and store it in a local varaible
		 * 3)instantiate the select class
		 */
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
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lavanya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vimalraj");
		driver.findElement(By.name("birthDate")).sendKeys("13/04/1994");
		driver.findElement(By.name("generalProfTitle")).sendKeys("Senior Team Lead");
		
		String title3=driver.getTitle();
		System.out.println(title3);
		
		//by index
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select=new Select(sourceDD);
		select.selectByIndex(4);
		//by value
		WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select select1=new Select(industryDD);
		select1.selectByValue("IND_MEDIA");
		
		//byvisible text
		WebElement ownerDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select select2=new Select(ownerDD);
		select2.selectByVisibleText("Corporation");
		
		//by visibletect
		WebElement marketingDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select select3=new Select(marketingDD);
		select3.selectByVisibleText("Automobile");
		
		WebElement currencyDD = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select select4=new Select(currencyDD);
		select4.selectByVisibleText("INR - Indian Rupee");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("1");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8220697952");
		
		// get the current title of the web page
		driver.findElement(By.name("submitButton")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		//close the window
		driver.close();
	
}
}
