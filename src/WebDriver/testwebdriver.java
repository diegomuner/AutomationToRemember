
package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testwebdriver {
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\diego\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("http://www.google.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		browser.quit();
		
		
		
	}

}
