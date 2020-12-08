package web_Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_column {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\Admin\\Desktop\\Selenium\\WebTable.html");
		
		           List<WebElement> col = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[1]/th"));
		           
		           System.out.println(col.size());

	}

}
