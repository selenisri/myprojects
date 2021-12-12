package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverGet {

	
	@Test
	public void driverget()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srira\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://zaicrm.com/#/");
		
	}
	
	@Test
	public void drivernavigate()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srira\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.braingroom.com/");
		
	}
	
	
	
}
