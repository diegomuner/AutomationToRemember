package tests;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import webdriver.WebDriverClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import atu.testrecorder.ATUTestRecorder;
import webdriver.ReadProperties;
import webdriver.WebDriverClass;
public class BaseTest {
	 ATUTestRecorder recorder;
	
@BeforeTest
public void baseBeforeTest() throws Exception {
	DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
	Date date = new Date();
	recorder = new ATUTestRecorder("E:\\GIT JAVA Projects\\AutomationToRemember\\mp4Result","TestVideo-"+dateFormat.format(date),false);
	recorder.start();  
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
public void baseAfterTest() throws Exception {
 recorder.stop();
 WebDriverClass.CloseBrowser();
 
	
}
	

}
