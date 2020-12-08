package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		              WebElement male = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
		              
		              driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
		              
		              
		               
		                 boolean result = male.isSelected();
		                 
		                 System.out.println(result);
		                 
		                 if(result==true)
		                 {
		                	 System.out.println("radio button is selected");
		                 }
		                 else
		                 {
		                	 System.out.println("radio butoon is not selected");
		                 }
		               
		               
		
		
	}

}
