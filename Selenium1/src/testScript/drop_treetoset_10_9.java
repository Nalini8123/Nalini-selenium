package testScript;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_treetoset_10_9 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/dropdown.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("hotel"));
		Thread.sleep(2000);
		Select s = new Select(ele);
		List<WebElement> opt = s.getOptions();
		ArrayList<String> l = new ArrayList<String>();
		for(WebElement o:opt)
		{
			l.add(o.getText());
		}
		TreeSet<String> t=new TreeSet<String>(l);
		for(String x:l) 
		{
		System.out.println(x);	
		}
	}
}
