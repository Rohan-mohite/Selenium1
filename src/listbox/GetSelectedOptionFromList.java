package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetSelectedOptionFromList {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s = new Select(day);
		
		System.out.print(s.getFirstSelectedOption().getText()+": ");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s1 = new Select(month);
		
		System.out.print(s1.getFirstSelectedOption().getText()+": ");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s2 = new Select(year);
		
		System.out.print(s2.getFirstSelectedOption().getText());
		
		
		

	}

}
