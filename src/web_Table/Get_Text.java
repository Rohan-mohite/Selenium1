package web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\Admin\\Desktop\\Selenium\\WebTable.html");
		
		        String text = driver.findElement(By.xpath("//table[@id='1234']/tbody/tr[3]/td[2]")).getText();
		        
		        System.out.println(text);

	}

}
