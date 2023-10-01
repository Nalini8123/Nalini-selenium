package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Insta_2_9 {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.instagram.com/accounts/login/?next=https%3A%2F%2Fwww.instagram.com%2Faccounts%2Fonetap%2F%3Fnext%3D%252F%26__coig_login%3D1");
	List<WebElement> all_links=driver.findElements(By.xpath("//a"));
	for(WebElement ele:all_links)
	{
		String text=ele.getText();
		System.out.println(text);
		}
	System.out.println(all_links.size());
}
}
