package Dynamicelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement crossbutton = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		
		if(crossbutton.isDisplayed())
		{
			crossbutton.click();
		}
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iphone 8 plus");
		
		
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		
		Thread.sleep(10000);

		
		 String ratings = driver.findElement(By.xpath("((//span[@class='_38sUEc'])[1]/span/span)[1]")).getText();
		 
		 
		 System.out.println(ratings);
		 
		   
		
		

	}

}
