package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import webdriver.WebDriverClass;
import pageelements.PageElements;

public class HomePage extends PageElements{

public HomePage(WebDriver browser) {
	PageElements.browser=browser;
	PageFactory.initElements(browser, this);
	
	}

public void GoToBlog() throws InterruptedException {
	Thread.sleep(5000);
	try {
	//browser.findElement(By.xpath("//*[@id=\"PopupSignupForm_0\"]/div[2]/div[1]")).click();
	WebElement closeDialogBox= browser.findElement(By.xpath("//*[@id=\"PopupSignupForm_0\"]/div[2]/div[1]"));
    closeDialogBox.click();
	} catch (NoSuchElementException e) {
		
		System.out.println("no esta el pop up ese chotodcc asique seguimos");
	}
	browser.findElement(By.xpath("//*[@id=\"header\"]/nav/ul[1]/li[1]/a")).click();
	
	
	
  
	Thread.sleep(5000);
	
}
	public void GoToForum() throws InterruptedException {
		
		try {
		//browser.findElement(By.xpath("//*[@id=\"PopupSignupForm_0\"]/div[2]/div[1]")).click();
		WebElement closeDialogBox= browser.findElement(By.xpath("//*[@id=\"PopupSignupForm_0\"]/div[2]/div[1]"));
	    closeDialogBox.click();
		} catch (NoSuchElementException e) {
			
			System.out.println("no esta el pop up ese chotodcc asique seguimos");
		}
		browser.findElement(By.xpath("//*[@id=\"header\"]/nav/ul[1]/li[2]/a")).click();
		
		
	  
		Thread.sleep(5000);
		}
	
	
	
}
