package seleniumpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff_display {
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver =new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test 
	public void test()
	{
		WebElement logo=driver.findElement(By.xpath("/html/body/center/form/div/table[1]/tbody/tr[1]/td[1]/img"));
		if(logo.isDisplayed())
		{
			System.out.println("visible");
		}
		else
		{
			System.out.println("not visible");
		}
		
		WebElement ck=driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
		if(ck.isSelected())
		{
			System.out.println("checked");
			
		}
		else
		{
			System.out.println("not checked");
		}
		
		WebElement mf=driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[24]/td[3]/input[1]"));
		if(mf.isSelected())
		{
			System.out.println("already selected");
			
		}
		else
		{
			System.out.println("not selected");
		}
		
	}

}
