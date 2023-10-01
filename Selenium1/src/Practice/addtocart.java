package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class addtocart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("iphone 13");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Apple iPhone 14 (128 GB) - Blue']")).click();
		JavascriptExecutor jse=(JavascriptExecutor)	driver;
		
		String p_id = driver.getWindowHandle();
		Set<String> all_id = driver.getWindowHandles();
		all_id.remove(p_id);
		for (String s : all_id)
		{
			Thread.sleep(2000);
			driver.switchTo().window(s);
			Thread.sleep(2000);
			WebElement ele = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
			Thread.sleep(2000);
			jse.executeScript("arguments[0].scrollIntoView();", ele);
			driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		}
		}
}