package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Admin/Desktop/checkbox.html");
	List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for (WebElement o : ele)
	{
		o.click();	
		Thread.sleep(2000);
	}
	int size = ele.size();
	for (int i = size-1; i >=0; i--) 
	{
	WebElement e	=ele.get(i);
	e.click();
	Thread.sleep(2000);
	}
	}
}
