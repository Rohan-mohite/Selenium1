package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getoption {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
	//	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
	//	Thread.sleep(2000);
		
		  WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s = new Select(month);
		
		List<WebElement> options = s.getOptions();
		
		System.out.println(options.size());                                                 
		
		for(WebElement ele:options)
		{
			System.out.println(ele.getText());
		}
		
		

	}

}
