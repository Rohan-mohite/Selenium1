package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Right_click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement closebutton = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		
		if(closebutton.isDisplayed())
		{
			closebutton.click();
		}
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		
		Actions act = new Actions(driver);
		
		//act.moveToElement(login).contextClick().build().perform();
		
		//act.contextClick().perform();
		
		act.contextClick(login).perform();
		
	

	}

}
