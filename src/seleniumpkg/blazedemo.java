package seleniumpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class blazedemo {
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void test()
	{
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("zandra");
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]")).sendKeys("ABC");
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("zandra@blazedemo.com");
	driver.findElement(By.xpath())
	}

}
