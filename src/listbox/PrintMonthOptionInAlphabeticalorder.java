package listbox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintMonthOptionInAlphabeticalorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s = new Select(month);
		
		List<WebElement> options = s.getOptions();
		
		TreeSet tr = new TreeSet();
		
		for(WebElement ele:options)
		{
			String text = ele.getText();
			tr.add(text);
		}
		System.out.println("-----print info in alphabetical orader-----");
		
		for(Object obj:tr)
		{
			System.out.println(obj);
		}
		
		

	}

}
