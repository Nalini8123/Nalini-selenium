package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube_27_8 {
public static void main(String[] args)  throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Recent kannada songs");
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	driver.findElement(By.xpath("//a[@class='ytp-cultural-moment-overlay ytp-hip-hop-50-overlay ytp-button']")).click();
}
}
