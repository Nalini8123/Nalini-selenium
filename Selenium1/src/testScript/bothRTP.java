package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bothRTP
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	//driver.close();
	driver.quit();
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver1=new FirefoxDriver();
	Thread.sleep(2000);
	//driver.close();
	driver1.quit();
}
}
