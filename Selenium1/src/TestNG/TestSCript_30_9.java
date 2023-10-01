package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSCript_30_9 {
	@Test 
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Pom_30_9 p=new Pom_30_9(driver);
		p.fblogin_button();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.fblogin_button();
}
}