package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipcartaddtocard_17_9 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='✕']")).click();	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("watch");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//svg[@xmlns='http://www.w3.org/2000/svg']")).click();
}
}
