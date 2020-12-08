package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
//driver.switchTo().frame(1);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		
//driver.switchTo().frame("iframeResult");
		
//driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[contains(text(),'display ')]")).click();
		
		Thread.sleep(2000);
		
//river.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
