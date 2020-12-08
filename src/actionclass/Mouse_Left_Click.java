package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Left_Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement crossbutton = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		
		if(crossbutton.isDisplayed())
		{
			crossbutton.click();
		}
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		
		 Actions act = new Actions(driver);
		 
		// act.moveToElement(login).click().build().perform();
		 
		 //act.moveToElement(login).perform();
		 
		 act.click(login).perform();
		 
		 
		 
		 
		
		

	}

}
