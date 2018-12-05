
package tests;


import org.openqa.selenium.WebDriver;
import org.testng.ReporterConfig.Property;
import org.testng.annotations.Test;

import pages.HomePage;
import webdriver.ReadProperties;
import webdriver.WebDriverClass;
import pages.HomePage;
public class testwebdriver extends BaseTest {
WebDriver driver;
HomePage homepage;

	
	
	
	@Test
	public void test1() throws InterruptedException {
		driver= WebDriverClass.getDriver();
		homepage = new HomePage(driver);
		Thread.sleep(5000);
		homepage.GoToBlog();	
		
		Thread.sleep(5000);
		
		
		
	
		
		
		
		
		
	}






}
