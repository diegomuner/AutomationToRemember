


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testwebdriver {
	
	
	public void test() {
		WebDriver browser = new ChromeDriver();
		browser.get("www.google.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		browser.quit();
		
		
		
	}

}
