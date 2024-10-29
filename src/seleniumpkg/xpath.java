package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div/input"));
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abhgfg");


}

}
