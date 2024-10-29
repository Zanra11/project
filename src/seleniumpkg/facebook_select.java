package seleniumpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_select {
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	}
	@Test
	public void test()
	{
		WebElement Day=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]"));
		Select day=new Select(Day);
		day.selectByValue("2");
		
		WebElement Month=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]"));
		Select month=new Select(Month);
		month.selectByIndex(5);
		
		WebElement Year=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]"));
		Select year=new Select(Year);
		year.selectByVisibleText("2003");
		
	}

}
