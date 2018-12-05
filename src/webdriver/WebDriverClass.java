package webdriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebDriverClass {
	private static ChromeDriver browser;
	
	public static void ChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\diego\\Downloads\\chromedriver_win32\\chromedriver.exe");
		browser = new ChromeDriver();
		}
	
	public static void CloseBrowser() {
		
		browser.quit();
	}
	
	public static void Navigate(String link) {
		
		browser.get(link);
		
	}
}
	

