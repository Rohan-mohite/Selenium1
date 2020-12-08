package POM_DDF_testNG_Baseclass_Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass 
{
    WebDriver driver;
    public void browserOpen()
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
    	
    	 driver = new ChromeDriver();
    	 
    	 driver.get("https://kite.zerodha.com/");
    	 
    	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	 
    	 driver.manage().window().maximize();
    }
}
