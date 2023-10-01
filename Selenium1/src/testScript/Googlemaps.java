/**
 * 
 */
package testScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
public class Googlemaps {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.com/maps/");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//button[@aria-label='Directions']"));
		ele.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Choose destination, or click on the map...\']")).sendKeys("Mysore");
		Thread.sleep(2000);
		WebElement ele1 =driver.findElement(By.xpath("//*[@id=\"directions-searchbox-1\"]/button[1]"));
		ele.clear();
	}
}
