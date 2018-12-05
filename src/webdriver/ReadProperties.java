package webdriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class ReadProperties {
	
	static String filePath = "E:/GIT JAVA Projects/AutomationToRemember/resources/config.properties";
	static Properties prop = new Properties();
	
	public static String ReadProperty(String a) {
		 
		// Properties file path.
		try (InputStream inputStream = new FileInputStream(filePath)) {
			// Loading the properties.
			prop.load(inputStream);
 
			// Getting properties 
			
	} catch (IOException ex) {
			System.out.println("Problem occurs when reading file !");
			ex.printStackTrace();
		} 
		//String url = prop.getProperty("url");
		String b = prop.getProperty("url");
		System.out.println(b);
		return b;
		
		//return url;
	
	}
	//public static String ReadProperty(String a) {
		
		//String b = prop.getProperty("url");
	//	System.out.println(b);
		//return b;
		
	
		}
	
	
	


