package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAsserts {
	
   SoftAssert softAssert = new SoftAssert();

	@Test(priority=0)
	public void Testing()
	{
		

		//working out on the softassert
		//hello

		System.out.println("Hello I will work !");
		softAssert.assertEquals(true, false); //Now even if this Assert Line Fails , Next will get Executed.
		System.out.println("Iam Fine");
		softAssert.assertEquals(true, true); //This Line Pass.
		System.out.println("Iam good");
		softAssert.assertAll();
		
		
	}
	

}
