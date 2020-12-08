package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
		
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("rohanmohite42@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}

}
