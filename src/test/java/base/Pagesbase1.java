package base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Pagesbase1{
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static Properties or = new Properties();
	public static Properties config = new Properties();
	
	public Pagesbase1()
	{
		if(driver==null)
		{
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			driver.get("https://www.naukri.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
			
	}
	
	
	
	

}
