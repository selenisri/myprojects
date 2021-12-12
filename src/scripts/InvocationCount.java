package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pageobjects.Loginelements;

public class InvocationCount {
	
	 @Test(invocationCount=3)
	 public void Testcase() 
	
	 {
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\srira\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	    	String baseUrl = "http://zaicrm.com/#/";  
	        driver.get(baseUrl);
	        PageFactory.initElements(driver,Loginelements.class);
	        String hello= driver.getTitle();   
	        System.out.println(hello);
	        driver.close();
}
}
