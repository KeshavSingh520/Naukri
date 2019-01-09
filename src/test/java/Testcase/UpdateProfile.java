package Testcase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.NaukriHome;

public class UpdateProfile {
	static SoftAssert softassert= new SoftAssert();
	
	@Test(priority=1)
	public static void doUpdates()
	{
		String title=NaukriHome.update();
		softassert.assertEquals(title,"Profile | Mynaukr");
		softassert.assertAll();
		
	}
	
	@Test(priority=2)
	public void teardown()
	{
		NaukriHome.driver.quit();
	}
	
	

}
