package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload_10_9 {public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Admin/Desktop/fileupload.html");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.id("f1"));
	Thread.sleep(2000);
	ele.sendKeys("C:\\Users\\Admin\\Desktop\\API.json");
}
}
