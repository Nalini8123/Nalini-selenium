package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail_20_8 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://accounts.google.com/AccountChooser/identifier?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser");
		driver.findElement(By.id("identifierId")).sendKeys("nalini");
		WebElement ele=driver.findElement(By.cssSelector("button[class='VfPpkd-RLmnJb']"));
		ele.click();
		WebElement ele1=driver.findElement(By.cssSelector("body [class='nyoS7c UzCXuf EIlDfe']"));
		ele1.click();
				
	}

}
