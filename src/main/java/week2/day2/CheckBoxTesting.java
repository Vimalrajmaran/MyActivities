package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBoxTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options =new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		//get the checkbox checked
		
		driver.findElement(By.className("ui-chkbox-label")).click();
		driver.findElement(By.id("j_idt87:j_idt91")).click();
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		WebElement toggleMessageElement = driver.findElement(By.className("ui-growl ui-widget"));  // Replace
        String expectedToggleMessage = "Toggle is on"; // Replace
        String actualToggleMessage = toggleMessageElement.getText();
        if (actualToggleMessage.contains(expectedToggleMessage)) {
            System.out.println("Toggle message verified: " + actualToggleMessage);
        } else {
            System.out.println("Toggle message verification failed. Expected to contain: " + expectedToggleMessage + ", Actual: " + actualToggleMessage);
        }
		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
		//driver.close();
	
		

	}

}
