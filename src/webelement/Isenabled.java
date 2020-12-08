package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://touch.facebook.com/");
		WebElement CreateNewAccount=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		boolean result=CreateNewAccount.isEnabled();
		
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("element is enabled");
		}
		else
		{
			System.out.println("element is not enabled");
		}
	}

}
