package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/dropdown.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("hotel"));
		Thread.sleep(2000);
		Select s = new Select(ele);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByValue("m");
		Thread.sleep(2000);
		s.selectByVisibleText("Mango");
		Thread.sleep(2000);
		s.deselectAll();
		Thread.sleep(2000);
		List<WebElement> opt = s.getOptions();
		for(WebElement o:opt)
		{
			System.out.println(o.getText());
		}
		if(s.isMultiple()) {
			System.out.println("Multiple");
		}
		else
		{
			System.out.println("not multiple");
		}
	}
}