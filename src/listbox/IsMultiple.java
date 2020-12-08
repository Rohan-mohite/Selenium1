package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s = new Select(month);
		
		boolean result = s.isMultiple();
		
		System.out.println(result);
		
		if(result==false)
		{
			System.out.println("listbox is of single selectable");
		}
		else
		{
			System.out.println("listbox is of multi selectable");
		}
	}

}
