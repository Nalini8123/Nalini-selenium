package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pass_20_8 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("file:///C:/Users/Admin/Desktop/pass.html");
	driver.findElement(By.id("a2")).sendKeys("abcd");
	driver.findElement(By.id("a1")).sendKeys("abcd");
	driver.findElement(By.id("a3")).click();
}
}
