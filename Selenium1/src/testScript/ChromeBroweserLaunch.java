package testScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBroweserLaunch {
	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key,value);
		ChromeDriver c = new ChromeDriver();
	}
}
