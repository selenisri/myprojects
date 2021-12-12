package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobjects.Loginelements;

public class LoginScripts {

	WebDriver driver;
	
    
     
     String [][] data= 
	 		{
	 		 {"Admin","Ad@121" ,"Invalid credentials"}, //invalid password
	 		 {"Admi","admin123 ", "Invalid credentials"}, //invalid user id
	 		 {"Admin@fiely.co","aiserve@121", "Invalid credentials" }, // both invalid
	 		 {"","", "Username cannot be empty"},//both Empty
	 		 {"Admin","", "Password cannot be empty"} ,//both Empty
	 		 {"Admin","admin123", "Dashboard"}
	 	     };
	     
	     @DataProvider(name="logindata")
	     public String[][] dataprovider()
	     {
	    	 return data;
	     }
    
	 @Test(dataProvider="logindata")
	 public void Testcase(String username , String password ,String hello ) throws InterruptedException
	
	 {
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\srira\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	    	String baseUrl = "https://opensource-demo.orangehrmlive.com/";  
	        driver.get(baseUrl);
	        PageFactory.initElements(driver,Loginelements.class);
	        Loginelements.username.sendKeys(username);
		    Loginelements.password.sendKeys(password);
		    Loginelements.loginbtn.click();
		    Assert.assertTrue(driver.getPageSource().contains(hello));
		    driver.close();
	 }
	 
	
	
	 
	 
	 
	}
	
	
	

