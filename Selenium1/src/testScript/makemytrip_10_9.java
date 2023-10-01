package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class makemytrip_10_9 {
	 public static void main(String[] args) throws InterruptedException 
	  {
		 	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		 	WebDriver driver=new FirefoxDriver();
		 	driver.get("https://www.makemytrip.com/");
		 	Thread.sleep(2000);
	  }
}
