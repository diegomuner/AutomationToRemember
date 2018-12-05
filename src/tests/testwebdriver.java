
package tests;


import org.testng.ReporterConfig.Property;
import org.testng.annotations.Test;


import webdriver.ReadProperties;
import webdriver.WebDriverClass;

public class testwebdriver {
	
	@Test
	public void test1() throws InterruptedException {
		WebDriverClass.ChromeBrowser();
		
		
		WebDriverClass.Navigate(ReadProperties.ReadProperty("url"));
		System.out.println(ReadProperties.ReadProperty("variable55"));
		Thread.sleep(5000);
		WebDriverClass.CloseBrowser();
	
		
		
		
		
		
	}

}
