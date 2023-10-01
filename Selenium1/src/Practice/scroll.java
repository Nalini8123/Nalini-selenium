package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		//scroll
		/*for (int i = 1; i <5; i++)
		{
			jse.executeScript("window.scrollBy(0,500)");
		}*/
		/*WebElement ele = driver.findElement(By.xpath("//a[.='Facebook']"));
		Thread.sleep(2000);
		jse.executeScript("arguments[0].scrollIntoView();", ele);*/
	}

}
