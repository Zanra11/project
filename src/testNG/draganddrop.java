package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class draganddrop {
	WebDriver driver;
	
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void bet()
	{
		driver.get("https://demoqa.com/droppable/");
	}
	@Test
	public void test()
	{
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
       act.dragAndDrop(drag, drop);
       act.perform();
       String actual=drop.getText();
System.out.println(actual);
       if(actual.equals("Drop here"))
       {
    	   System.out.println("pass");
       }
       else
       {
    	   System.out.println("fail");
       }
    	
		
		
		
	}
	

}
