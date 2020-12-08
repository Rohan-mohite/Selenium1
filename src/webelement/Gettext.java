package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://touch.facebook.com/");
		
		WebElement forgotton=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		String text =forgotton.getText();
		System.out.println(text);
		
		System.out.println(driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText());
	}

}
