	package week3.day3.marathon;
	
	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.safari.SafariDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import java.time.Duration;
	
	public class PvrBooking {
	
	    public static void main(String[] args) throws InterruptedException {
	    	WebDriver driver = new SafariDriver();
	        driver.get("https://www.pvrcinemas.com/");
	        driver.manage().window().maximize();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        //driver.findElement(By.className("p-dropdown-label p-inputtext p-placeholder")).click();
	       try {
	        Thread.sleep(5000);
	        //driver.findElement(By.xpath("//span[@class='sc-gjcoXW hFdstN pointer']")).click();
	        driver.findElement(By.xpath("//span[text()='Cinema']")).click();
	        driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[4]/span")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//li[@class='p-dropdown-item'][1]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[4]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//button[@class='p-button p-component sc-hORkcV gUVSfS bgColor filter-btn']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//button[@class='sc-kfeOyU hsmcHs reject-terms']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//span[@id='EL.ELITE|G:10']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//button[@class='sc-dJkDXt bWYhCG btn-proceeded']")).click();
	        Thread.sleep(2000);
	        String text = driver.findElement(By.xpath("//div[@class='seat-number']")).getText();		//Printing Seat Number
	        System.out.println("Seat Number:" +text);
	        String text2 = driver.findElement(By.xpath("//div[@class='ticket-value-ticket']")).getText(); //printing ticket Price
	        System.out.println("Ticket Price " +text2);
	        String text3 = driver.findElement(By.xpath("//div[@class='all-grand']")).getText(); //Printing Grand Total
	        System.out.println(text3);
	        Thread.sleep(3000);
	        //Proceed for booking ticket
	        driver.findElement(By.xpath("//button[@class='fb-added-btndesk']")).click();
	        Thread.sleep(2000);
	        }
	       catch(Exception e)
	       {
	    	   System.out.println("An errordd occured" +e.getMessage()); 			//if any exception throws it should be diplayed
	       }
	       finally
	       {
	        driver.quit();      //close the browser
	       }
	    }
	}