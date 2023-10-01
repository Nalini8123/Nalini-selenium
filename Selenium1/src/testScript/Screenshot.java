package testScript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException
	  {
		 	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		 	WebDriver driver=new FirefoxDriver();
		 	driver.get("https://www.facebook.com");
		 	TakesScreenshot tss=(TakesScreenshot)driver;
		 	File temp = tss.getScreenshotAs(OutputType.FILE);
		 	File per = new File("./photo/a.png");
		 	FileHandler.copy(temp,per);
	  }
	}

