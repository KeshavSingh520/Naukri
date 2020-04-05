package Testcase;

import org.testng.annotations.Test;

import Pages.NaukriHome;



public class TestNaukriHome {
	
	
	
	@Test
	public void performLogin()
	{
		NaukriHome naukri=new NaukriHome();
		naukri.doLogin("keshavsingh520@gmail.com", "206806205");
		
		
	}

	
	
	
	

}
