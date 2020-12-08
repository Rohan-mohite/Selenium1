package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://touch.facebook.com/");
		
		WebElement un=driver.findElement(By.xpath("//input[@name='email']"));
		
		un.sendKeys("abc");
		
		Thread.sleep(2000);
		
		un.clear();
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		
		pass.sendKeys("pqr");
		
		pass.clear();

	}
}