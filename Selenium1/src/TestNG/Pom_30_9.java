package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_30_9 {
//declaration
	@FindBy(name="email")
	 private WebElement send;
	@FindBy(name="pass")
	 private WebElement send1;
	@FindBy(name="login")
	 private WebElement search;
//initialization
public Pom_30_9 (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void fblogin_button() 
{
	send.sendKeys("abc");
	send1.sendKeys("123");
	search.click();
}
}
