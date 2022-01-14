package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pageobjects.Loginelements;

public class Jumptoalert {
	
	
	 @Test(priority=1)
	 public void Clickthebutton() 
	
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\srira\\OneDrive\\Desktop\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	    	String baseUrl = "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";  
	        driver.get(baseUrl);
	        driver.manage().window().maximize();
	        WebElement button= driver.findElement(By.xpath("//input[@name='alert']"));
	        button.click();
	        String text=driver.switchTo().alert().getText();
	        System.out.println(text);
	        
	   }
	 
	 @Test(priority=2)
	 public void Acceptthealert() 
	
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\srira\\OneDrive\\Desktop\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	    	String baseUrl = "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";  
	        driver.get(baseUrl);
	        driver.manage().window().maximize();
	        WebElement button= driver.findElement(By.xpath("//input[@name='alert']"));
	        button.click();
	        driver.switchTo().alert().dismiss();
	        
	        
	  }
	 
	 
	 @Test(priority=3)
	 public void Accept() throws InterruptedException 
	
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\srira\\OneDrive\\Desktop\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	    	String baseUrl = "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";  
	        driver.get(baseUrl);
	        driver.manage().window().maximize();
	        WebElement button= driver.findElement(By.id("double-click"));
	        Actions action = new Actions(driver);
	        action.doubleClick(button).perform();
	        
	      
	       
	  }
	 
	 
	 
	 @Test(priority=4)
	 public void MovetoElement() throws InterruptedException 
	
	 {
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\srira\\OneDrive\\Desktop\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	    	String baseUrl = "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";  
	        driver.get(baseUrl);
	        driver.manage().window().maximize();
	        WebElement elementh  = driver.findElement(By.id("sub-menu"));
	        Actions action = new Actions(driver);
	        action.moveToElement(elementh).perform();
	        driver.findElement(By.xpath("//a[contains(text(),'Google')]")).click();
	        
	  }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
}
