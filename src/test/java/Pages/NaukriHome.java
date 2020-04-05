package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;


import base.Pagesbase1;

public class NaukriHome extends Pagesbase1 {
	
	
	public static void doLogin(String username,String password)
	{
		driver.findElement(By.cssSelector("a[title='Jobseeker Login']")).click();
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys(username);
		driver.findElement(By.cssSelector("input[name='PASSWORD']")).sendKeys(password);
		driver.findElement(By.cssSelector("button[type='submit'][value='Login']")).click();
		
		
	}
	
	public static String  update()
	{
		driver.findElement(By.cssSelector("a[data-ga-track='spa-event|Profile_NHP|Update Profile|Click']")).click();
		driver.findElement(By.cssSelector("em[class='icon edit']")).click();
		driver.findElement(By.cssSelector("button[type='button']")).click();
		 return driver.getTitle();
		
	}

}
