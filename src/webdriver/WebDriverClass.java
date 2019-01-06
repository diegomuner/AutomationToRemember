package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverClass {
	public static ChromeDriver browser;
	
	public static void ChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\diego\\Downloads\\chromedriver_win32\\chromedriver.exe");
		browser = new ChromeDriver();
	
		}
	
	
	public WebDriverClass() {
		
		ChromeBrowser();
		
	}
	
	public static void CloseBrowser() {
		
		browser.quit();
	}
	
	public static void Navigate(String link) {
		
		browser.get(link);
		
	}
	
	public static ChromeDriver getDriver() {
		
		return browser;
		
		
	}
	
	public void PressReturnKey(String value) {
	browser.findElement(By.name(value)).sendKeys(Keys.RETURN);
	}
}
	

