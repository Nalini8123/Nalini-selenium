package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkartaddtocart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='✕']")).click();
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("saree");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Self Design Bollywood Net Saree']")).click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		String p_id = driver.getWindowHandle();
		Set<String> all_id = driver.getWindowHandles();
		all_id.remove(p_id);
		for (String id : all_id)
		{
			Thread.sleep(2000);
			driver.switchTo().window(id);
			Thread.sleep(2000);
			for (int i = 1; i <8; i++) 
			{
				Thread.sleep(2000);
				jse.executeScript("window.scrollBy(0,500)");
			}
			/*WebElement ele = driver.findElement(By.xpath("//button[.=' Add to cart']"));
			Thread.sleep(2000);
			jse.executeScript("arguments[0].scrollIntoView();", ele);*/
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[.=' Add to cart']")).click();		
			}
		}
}
