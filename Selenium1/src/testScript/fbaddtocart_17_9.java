package testScript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fbaddtocart_17_9 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).click();
	driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("iPhone14");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
	Thread.sleep(2000);
	
	String p_id = driver.getWindowHandle();
	Set<String> all_id = driver.getWindowHandles();
	all_id.remove(p_id);
	
	for (String id : all_id)
	{
		Thread.sleep(2000);
		driver.switchTo().window(id);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	}
	
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	WebElement ele = driver.findElement(By.xpath("//input[@class='a-button-input attach-dss-atc']"));
	Thread.sleep(2000);
	jse.executeScript("arguments[0].ScrollIntoview() ;", ele);
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	}}


