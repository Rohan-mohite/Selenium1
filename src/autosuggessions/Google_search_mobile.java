package autosuggessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_search_mobile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String exp = "oneplus tv";
		
		      driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("oneplus");
		      
		      Thread.sleep(2000);
		      
		        List<WebElement> options = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		        
		        System.out.println(options.size());
		        
		        for (WebElement ele : options) 
		        {
				      String act = ele.getText();
				      
				      System.out.println(act);
				      
				      if(act.equals(exp))
				      {
				    	  ele.click();
				    	  break;
				      }
				}

	}

}
