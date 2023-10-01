package testScript;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxclose {
	public static void main(String[]args) throws InterruptedException
	{
		String key="webdriver.gecko.driver";
		String value="./softwares/geckodriver.exe";
		System.setProperty (key, value);
		FirefoxDriver fx=new FirefoxDriver();
		Thread.sleep(5000);
		//fx.close();
		fx.quit();
		
	}	
}
