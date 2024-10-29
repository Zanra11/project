package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlepgm {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
driver.findElement(By.id("email")).sendKeys("abc@gmail");
driver.findElement(By.id("pass")).sendKeys("hrefg");
driver.findElement(By.name("login")).click();
driver.findElement(By.xpath("//*[contains(text(),'Log in')]")).click();

	}

}
