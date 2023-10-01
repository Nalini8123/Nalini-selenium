package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DROP {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Desktop/dropdown.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("hotel"));
		Select s = new Select(ele);
		List<WebElement> opt = s.getOptions();		
		ArrayList<String> a = new ArrayList<String>();
		for (WebElement o : opt) 
		{
			a.add(o.getText());
		}
		Collections.sort(a);
		for (String string : a) {
			System.out.println(string);
		}
}
}