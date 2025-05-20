package TestNG.demo;

import org.testng.annotations.*;

public class LoginTest {
	@BeforeMethod
	public void beforeEachTest(){
		System.out.println("Launch Browser and go to login page");		
	}
	@Test(priority = 1, groups = {"Smoke"})
	public void testLoginWithValidUserName()
	{
		System.out.println("Test with Valid Creditinals");
	}
	@Test(priority = 2,groups = {"Regression"})
	public void testLoginWithInvalidUserName()
	{
		System.out.println("Test login with invalid credentials");
	}
	@AfterMethod
	public void afterEachTest()
	{
		System.out.println("Close the Browser");
	}
}
