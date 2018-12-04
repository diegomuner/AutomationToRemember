
package tests;


import org.testng.annotations.Test;
import webdriver.WebDriverClass;

public class testwebdriver {
	
	@Test
	public void test1() {
		WebDriverClass.ChromeBrowser();
		WebDriverClass.Navigate("https://www.google.com");
		WebDriverClass.CloseBrowser();
		
		
		
	}

}
