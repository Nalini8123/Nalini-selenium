package testScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll {
	public static void main(String[] args) throws InterruptedException 
	  {
		 	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		 	WebDriver driver=new FirefoxDriver();
          JavascriptExecutor jse=(JavascriptExecutor)driver;
          driver.get("https'//www.amazon.in");
          for(int i=1;i<=3;i++)
          {
        	  Thread.sleep(2000);
        	  jse.executeScript("window.scrollBy(0,500)");
    }
          for(int i=1;i<=3;i++)
          {	  
        	  Thread.sleep(2000);
        	  jse.executeScript("window.scrollBy(0,-500)");
    }
          }
}