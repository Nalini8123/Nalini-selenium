package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nalini {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/search?q=nalini&sca_esv=562133542&source=hp&ei=393yZL6OOfTW2roP86SmgAg&iflsig=AD69kcEAAAAAZPLr74-rADVFsstOa4xYGl95AiIEYvqk&ved=0ahUKEwj--ajQrYuBAxV0q1YBHXOSCYAQ4dUDCAg&uact=5&oq=nalini&gs_lp=Egdnd3Mtd2l6IgZuYWxpbmkyCBAuGIAEGLEDMgUQABiABDIFEC4YgAQyCBAuGIAEGLEDMgUQLhiABDIIEAAYgAQYsQMyCxAuGIAEGMcBGK8BMgUQABiABDIFEAAYgAQyBRAAGIAESLfjJlCkiBRYzKgUcAR4AJABAJgBywKgAc8IqgEHMi4yLjAuMrgBA8gBAPgBAagCCsICEBAAGAMYjwEY6gIYjAMY5QLCAhAQLhgDGI8BGOoCGIwDGOUCwgILEAAYgAQYsQMYgwHCAhEQLhiABBixAxiDARjHARjRA8ICCxAuGIoFGLEDGIMBwgILEC4YgAQYsQMYgwHCAhEQLhiKBRixAxiDARjHARjRA8ICERAuGIMBGMcBGLEDGNEDGIAEwgIREC4YigUYsQMYgwEYxwEYrwHCAggQLhixAxiABA&sclient=gws-wiz");

	Thread.sleep(2000);
	List <WebElement> all_links = driver.findElements(By.xpath("//h3"));
	for(WebElement ele:all_links)
	{
		String text = ele.getText();
	System.out.println(text);	
	}
	System.out.println(all_links.size());
}
}
