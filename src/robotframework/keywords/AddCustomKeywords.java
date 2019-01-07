package robotframework.keywords;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import pages.HomePage;
import webdriver.ReadProperties;
import webdriver.WebDriverClass;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RobotKeywords
public class AddCustomKeywords {
	ATUTestRecorder recorder;
	WebDriver driver;
	HomePage homepage;
	
	
	
	@RobotKeyword
	public void StartRecording() throws Exception{
		
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
		driver= WebDriverClass.getDriver();
		
	}
	
	
	@RobotKeyword
	public void ClosesBrowser() throws Exception {
			 recorder.stop();
			 WebDriverClass.CloseBrowser();
		}
	
	/*
	@RobotKeyword
	public void ClickSection() {
		
	driver= WebDriverClass.getDriver();
	driver.findElement(By.xpath("//*[@id='myNav']/ul[1]/li[2]/a")).click();
		
	}	
	
	*/
}
	

