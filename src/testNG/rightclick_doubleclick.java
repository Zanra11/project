package testNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rightclick_doubleclick {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void link()
	{
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");	
	}
	@Test
	public void test()
	{
		WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
		Actions act=new Actions(driver);
		act.contextClick(right).perform();
	
		act.contextClick(edit).perform();
		
		Alert a=driver.switchTo().alert();
		a.accept();
		WebElement doble=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doble).perform();
		Alert b=driver.switchTo().alert();
		b.accept();
		
	}
	

}
