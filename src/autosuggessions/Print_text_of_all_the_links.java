package autosuggessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_text_of_all_the_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		System.out.println("no of links present in a webpage" + links.size());
		
		for (WebElement link : links) 
		{
		    System.out.println(link.getText());	
		}

	}

}
