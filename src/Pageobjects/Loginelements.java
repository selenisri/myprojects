package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginelements {


    @FindBy(xpath="//*[@id='txtUsername']")
    public static WebElement username;

    @FindBy(xpath="//*[@id='txtPassword']")
    public static WebElement password;    

  
    @FindBy(xpath="//*[@id='btnLogin']")
    public static WebElement loginbtn;
    
    @FindBy(xpath="//*[@data-automationid='login-login-error']")
    public static WebElement usererror;
    
    @FindBy(xpath="//*[@data-automationid='login-password-error']")
    public static WebElement passworderror;
    
    
    
    
    
       }
    


