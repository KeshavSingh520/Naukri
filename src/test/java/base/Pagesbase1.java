package base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Pagesbase1{
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static Properties or = new Properties();
	public static Properties config = new Properties();
	DesiredCapabilities cap= new DesiredCapabilities();
	
	public Pagesbase1() 
	{
		if(driver==null)
		{
			cap.setBrowserName("chrome");
			WebDriverManager.chromedriver().setup();
			try {
				driver =new RemoteWebDriver(new URL("http://192.168.1.11:8078/wd/hub"),cap);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.get("https://www.naukri.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
			
	}
	
	
	
	

}
