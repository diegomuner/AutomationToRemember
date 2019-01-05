package robotframework.keywords;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
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
	
	
	
	
	@RobotKeyword
	public void StartRecordingAndOpenBrowser() throws Exception{
		
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
	
	@RobotKeyword
	public void ClosesBrowser() throws Exception {
			 recorder.stop();
			 WebDriverClass.CloseBrowser();
		}
	
}
	

