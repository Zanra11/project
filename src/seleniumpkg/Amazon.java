package seleniumpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	}
@Test
	public void test()
	{
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[5]")).click();
		driver.navigate().back();
	}

		@Test
		public void test1()
		{
	driver.findElement(By.id("nav-cart-count")).click();
	driver.navigate().back();
		}
		
	@Test
	public void test2()
	{
	driver.findElement(By.id("nav-link-accountList-nav-lines-1")).click();
	driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("continue")).click();
	driver.navigate().back();
	driver.navigate().back();
	driver.findElement(By.id("nav-hamburger-menu")).click();
	}

}
