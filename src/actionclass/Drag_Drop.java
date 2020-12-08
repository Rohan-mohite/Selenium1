package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		            WebElement dest = driver.findElement(By.xpath("//ol[@id='bank']"));
		            
		            Thread.sleep(2000);
		            
		            Actions act = new Actions(driver);
		            
		          //  act.dragAndDrop(source, dest).perform();
		            
		            act.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();
		            
		            
		
		
		
		
		
		

	}

}
