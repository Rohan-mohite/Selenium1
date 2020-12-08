package New;

import java.awt.Paint;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://eaccount.indiainfoline.com/Login");
		
		String expected ="IIFL";
		
		String actual=d.getTitle();
		
		System.out.println(actual);
		
		if(actual.contains(expected))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		Thread.sleep(2000);
		
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		

	Dimension d1= new Dimension(200,300);
	
	d.manage().window().setSize(d1);
	
	
	
	Point p= new Point(400,500);
	
	d.manage().window().setPosition(p);
	
	d.quit();
	
	
	
	
	
	}
}


