package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.fblogin_page;

public class fblogin_test {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		
		}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.facebook.com");
	}
	@Test
	public void testlogin()
	{
		fblogin_page ob=new fblogin_page(driver);
		ob.setvalues("abc@gmail","abc");
		ob.login();
	}

}
