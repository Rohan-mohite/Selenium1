package New;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://eaccount.indiainfoline.com/Login");
		
		driver.manage().window().maximize();
		
		String expected="IIFL";
		
		String actual =driver.getTitle();
		System.out.println(actual);
		
		if(actual.contains(expected))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		String url=driver.getCurrentUrl();
		{
			System.out.println(url);
		}
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		Dimension d =new Dimension(200,400);
		
		driver.manage().window().setSize(d);
		
		Thread.sleep(2000);
		
		Point p= new Point(100,500);
		
		driver.manage().window().setPosition(p);
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().refresh();
		
		driver.close();


	}

}
