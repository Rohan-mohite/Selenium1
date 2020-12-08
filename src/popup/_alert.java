package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
		Thread.sleep(2000);
		
		       Alert alt = driver.switchTo().alert();
		       
		       System.out.println(alt.getText());
		       
		       alt.accept();
		
		
	}

}
