package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_page_29_9 {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("nav-search-submit-button"));
		ele.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		ele.click();
}
}
