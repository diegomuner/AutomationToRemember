
package tests;


import org.openqa.selenium.WebDriver;
import org.testng.ReporterConfig.Property;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import screenrecorder.ScreenRecorder;
import screenrecorder.TestListener;
import pages.HomePage;
import webdriver.ReadProperties;
import webdriver.WebDriverClass;
import pages.HomePage;
public class testwebdriver extends BaseTest {
WebDriver driver;
HomePage homepage;

	
 @Listeners(TestListener.class)
public class RecordingTest {

	private final Logger logger = LoggerFactory.getLogger(RecordingTest.class);

	
	@Test
		public void OpenBlog() throws InterruptedException {
		
		logger.info("start OpenBlog testcase");
	
			driver= WebDriverClass.getDriver();
			homepage = new HomePage(driver);
			Thread.sleep(5000);
			homepage.GoToBlog();
			Thread.sleep(5000);
			
			
			
		logger.info("end of OpenBlog testcase");
			
		}
	
	
	
	
		public void OpenForum() throws InterruptedException {
	
			driver= WebDriverClass.getDriver();
			homepage = new HomePage(driver);
			Thread.sleep(5000);
			homepage.GoToForum();
			Thread.sleep(5000);
}

	
	

	
}
 }
