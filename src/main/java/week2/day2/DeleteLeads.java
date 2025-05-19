package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLeads {

	public static void main(String[] args) throws InterruptedException {
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
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.partialLinkText("Phone")).click();
		driver.findElement(By.xpath("//input[@id='ext-gen262']")).clear();
		driver.findElement(By.xpath("//input[@id='ext-gen262']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@id='ext-gen266']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("8220697952");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String message = driver.findElement(By.className("x-paging-info")).getText();
		
		if(message.equals("No records to display"))
		{
			System.out.println("No lead found");
		}
		else {
		WebElement firstLeadElement = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		String leadID = firstLeadElement.getText();
		System.out.println("Captured Lead ID:" +leadID);
		
		firstLeadElement.click();
		driver.findElement(By.partialLinkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		//driver.findElement(By.name("id")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		Thread.sleep(3000);
		/*driver.findElement(By.partialLinkText("Phone")).click();
		driver.findElement(By.xpath("//input[@id='ext-gen262']")).clear();
		driver.findElement(By.xpath("//input[@id='ext-gen262']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@id='ext-gen266']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("8220697952");
		driver.findElement(By.partialLinkText("Delete")).click();
		
		
		driver.findElement(By.linkText("Find Leads")).click();*/
		
		
		String message1 = driver.findElement(By.className("x-paging-info")).getText();
		
		if(message1.equals("No records to display"))
		{
			System.out.println("Lead deletion successful");
		}
			else {
			System.out.println("Lead deletion failed");
			}
		driver.quit();
		
		
		}
				
	}

}
