package Week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsHandle {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //driver.findElement(By.className("p-dropdown-label p-inputtext p-placeholder")).click();
       try {
    	driver.navigate();
    	driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
    	Thread.sleep(5000);
        String Parentwindow = driver.getWindowHandle();
        System.out.println(Parentwindow);
        System.out.println(driver.getTitle());
        Set<String> flight = driver.getWindowHandles();
        //convert into list
        List<String> listflight = new ArrayList<String>(flight);
        driver.switchTo().window(listflight.get(1));
        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);
        System.out.println(driver.getTitle());
        driver.switchTo().window(listflight.get(0));
       	}
       
       catch(Exception e)
       {
    	   System.out.println(e.getMessage());
       }
       finally
       {
    	   driver.close();
       }
}
}