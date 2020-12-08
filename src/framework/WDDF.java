package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WDDF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vijay@123");
		
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
		
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		boolean result = driver.findElement(By.xpath("//span[text()='KV']")).isDisplayed();
		
		System.out.println(result);
		
		if(result)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
