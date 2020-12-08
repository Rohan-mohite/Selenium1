package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver d =new ChromeDriver();
		
		d.get("https://www.flipkart.com/");
		
		d.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9689452426");
		
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("Rohan");
		
		d.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		d.findElement(By.xpath("//a[@class='_21JmK0 _1__46T']")).click();
		
		
		

	}

}
