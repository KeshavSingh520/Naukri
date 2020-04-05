package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;


import base.Pagesbase1;

public class NaukriHome extends Pagesbase1 {
	
	
	public static void doLogin(String username,String password)
	{
		logger.info("Clicking on Login");
		driver.findElement(By.cssSelector("a[title='Jobseeker Login']")).click();
		driver.findElement(By.xpath("//div[@class='form-row']/input[@type='text']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
	
	public static String  update()
	{
		driver.findElement(By.cssSelector("a[data-ga-track='spa-event|Profile_NHP|Update Profile|Click']")).click();
		driver.findElement(By.cssSelector("em[class='icon edit']")).click();
		driver.findElement(By.cssSelector("button[type='button']")).click();
		 return driver.getTitle();
		
	}

}
