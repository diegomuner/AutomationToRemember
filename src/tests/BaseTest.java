package tests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import webdriver.ReadProperties;
import webdriver.WebDriverClass;
public class BaseTest {

	
@BeforeTest
public void baseBeforeTest() {
	WebDriverClass.ChromeBrowser();
	WebDriverClass.Navigate(ReadProperties.ReadProperty("url"));
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

@AfterTest
public void baseAfterTest() {
 WebDriverClass.CloseBrowser();
	
}
	

}
