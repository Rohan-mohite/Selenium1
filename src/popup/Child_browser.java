package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		//get id of main page
	        String mainpageid = driver.getWindowHandle();
	        
	        System.out.println(mainpageid);
	        
	        //get id of main page & child browser
	        
	        Set<String> ids = driver.getWindowHandles();
	        
	                 ArrayList<String> al = new ArrayList<String>(ids);
	                 
	                 //switch to child browse pop up
	                 
	                 driver.switchTo().window(al.get(1));
	                 
	               System.out.println(al.get(1));
	                 
	                 

	}

}
