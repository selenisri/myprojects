package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pageobjects.Loginelements;

public class DoubleandRightclick {
	
	
	
	 @Test
	 public void Testcase() 
	
	 {
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\srira\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	    	String baseUrl = "http://zaicrm.com/#/";  
	        driver.get(baseUrl);
	        PageFactory.initElements(driver,Loginelements.class);
	        Actions action = new Actions(driver);
	        WebElement element= driver.findElement(By.id("login"));
	        WebElement ele = driver.findElement(By.id("password"));
	        //Double click
	        //action.doubleClick(element).perform();

	        
	        //Right Click
	        action.contextClick(ele).perform();
	        
	        //Mouse over
	        action.moveToElement(element).perform();

	        
	 }

}
