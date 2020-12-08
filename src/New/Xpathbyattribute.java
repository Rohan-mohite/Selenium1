package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyattribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://eaccount.indiainfoline.com/Login");		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
		
		driver.close();
		
		

	}

}
