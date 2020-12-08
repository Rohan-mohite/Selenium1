package customizedlistbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample1 {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Actions act = new Actions(driver);
		
		act.click(month).perform();
		
		Thread.sleep(2000);
		
		for(int i=1;i<=12;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			
			Thread.sleep(2000);
		}
		   for(int i=1;i<=5;i++)
		   {
			   act.sendKeys(Keys.ARROW_DOWN).perform();
			   
			   Thread.sleep(2000);
		   }
		   act.sendKeys(Keys.ENTER).perform();
		
	}

}
