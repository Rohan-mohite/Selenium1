package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Double_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		
		//act.moveToElement(ele).doubleClick().build().perform();

		act.doubleClick(ele).perform();
		
		//act.moveToElement(ele).perform();
		
		//act.doubleClick().perform();
		
	}

}
