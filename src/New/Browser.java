package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Browser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rohan");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mohite");
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("9689452426");
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Rohan@2793");

		Select sel1 = new Select(driver.findElement(By.xpath("//select[@id=\"day\"]")));
		
		sel1.selectByIndex(27);
		
		Select sel2 = new Select(driver.findElement(By.xpath("//select[@id=\"month\"]")));
		
		sel2.selectByVisibleText("Aug");
		
		Select sel3= new Select(driver.findElement(By.xpath("//select[@id=\"year\"]")));
		
		sel3.selectByValue("1993");
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}
}