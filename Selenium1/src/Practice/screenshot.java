package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		TakesScreenshot jse= (TakesScreenshot) driver;
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		File temp = jse.getScreenshotAs(OutputType.FILE);
		File per =new File("./Photo/b.png");
		FileHandler.copy(temp, per);
	}
		}
