package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome19_8 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.google.com");
		 String title = driver.getTitle();
		 System.out.println(title);
		 String url = driver.getCurrentUrl();
		 System.out.println(url);
		 String page= driver.getPageSource();
		 System.out.println(page);
	}
}
