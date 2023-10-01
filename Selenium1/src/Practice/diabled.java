package Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class diabled {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		driver.get("file:///C:/Users/Admin/Desktop/disabled.html");
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('a2').value='5000'");
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('a2').value=''");
}
}
