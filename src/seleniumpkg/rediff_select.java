package seleniumpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rediff_select {
	ChromeDriver driver;
	@Before
	
 public void open()
 {
 driver=new ChromeDriver();
 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
 }
	
@Test
public void test()
{
	WebElement dayelement = driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[1]"));
	Select day=new Select(dayelement);
	day.selectByValue("04");
	List<WebElement> liq=day.getOptions();
	System.out.println(liq.size());
	

	


	WebElement monthelement=driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[2]"));
	Select month=new Select(monthelement);
	month.selectByIndex(3);
	List<WebElement> lim=month.getOptions();
	System.out.println(lim.size());
	



	WebElement Year= driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[3]"));
	Select year=new Select(Year);
	year.selectByVisibleText("2003");
	List<WebElement> liy=year.getOptions();
	System.out.println(liy.size());
}


}
	
