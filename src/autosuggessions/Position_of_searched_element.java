package autosuggessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Position_of_searched_element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String exp = "redmi 8";
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redm 8");
		
		Thread.sleep(2000);
		
		  List<WebElement> element = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		  
		  System.out.println(element.size());
		  
		 
		  
		  for(int i=0;i<=element.size()-1;i++)
		  {
			 String act = element.get(i).getText();
			 
			 System.out.println(act);
			 if(act.equals(exp))
			 {
				 
				 System.out.println("given element"+exp+"found at position"+(i+1));
				 break;
			 }
		  }

	}

}
