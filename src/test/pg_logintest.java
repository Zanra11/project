package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.pg_fblogin;

public class pg_logintest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void testlogin()
	{
		 pg_fblogin ob=new  pg_fblogin(driver);
		 ob.setvalues("abc@gmail.com","abc");
		 ob.login();
		
	}
	

}
