package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(2000);
		
		        String mainpage = driver.getWindowHandle();
		        
		        System.out.println("main page id"  + mainpage);
		        
		        driver.findElement(By.name("NewWindow")).click();
		        
		        Thread.sleep(2000);
		        
		       Set<String> childpage = driver.getWindowHandles();
		       
		       System.out.println("childpage id"  + childpage);
		       
		       ArrayList<String> al = new ArrayList<String>(childpage);
		       
		       Thread.sleep(2000);
		       
		       driver.switchTo().window(al.get(0));
		       
		       driver.quit();
		       
		       

	}

}
