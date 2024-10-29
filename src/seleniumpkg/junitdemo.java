package seleniumpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitdemo {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https:www.google.com");
		System.out.println("browser open");
	}
	@Test
	public void test()
	{
		String act=driver.getTitle();
		String expectedtitle="google";
		if(act.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		System.out.println("act");
		System.out.println("test activities");
	}
	@After
	public void browserclose()
	{
		System.out.println("browser close");
	}

}
