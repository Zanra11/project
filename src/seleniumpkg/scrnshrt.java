package seleniumpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class scrnshrt {
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver =new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
				}
	@Test
	public void srnshrt() throws Exception
	{
//		File srs=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(srs,new File("C:\\Users\\CYBERHUB\\OneDrive\\Desktop\\avf\\src.png"));
		WebElement day=driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[1]"));
		File ss=day.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, new File("./zandra//san.png"));
	}

}
