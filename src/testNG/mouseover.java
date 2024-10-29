package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mouseover {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		
	driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.ebay.com/");
	}
	@Test
	public void test()
	{
		WebElement electronics=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
				Actions act=new Actions(driver);
		act.moveToElement(electronics).perform();
	}
	
	

}
