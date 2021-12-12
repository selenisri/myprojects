package scripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeMethodAfterMethod {
	
	
	@Test
	public void caseone()
	{
	System.out.println("Test One");
	}
	 
	@Test
	public void casetwo()
	{
	System.out.println("Test Two");
	}
	 
	@BeforeMethod
	public void dependent()
	{
	 System.out.println("i will run Before every method");
	}
	
	@BeforeTest
	public void Test()
	{
		System.out.println("I will run once before executing the Test Cases");
		
	}
	
	


}
