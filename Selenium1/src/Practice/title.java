package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class title {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		String p = driver.getWindowHandle();
		Set<String> ele = driver.getWindowHandles();
		ele.remove(p);
		for (String o : ele) 
		{
			Thread.sleep(2000);
			driver.switchTo().window(o);
			Thread.sleep(2000);
			driver.close();
			}
		
		}
}
