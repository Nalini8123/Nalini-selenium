package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_27_8 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).click();
	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Bag");
    driver.findElement(By.xpath("//path[class='_34RNph']")).click();
}
}