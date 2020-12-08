package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://eaccount.indiainfoline.com/Login");
		
		driver.navigate().to("https://eaccount.indiainfoline.com/Login");
		Thread.sleep(3000);
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(3000);
	
	driver.navigate().back();
	
	Thread.sleep(3000);
	
	driver.navigate().forward();
	
	Thread.sleep(3000);
	
	driver.navigate().refresh();
		
		String expected = "IIFL Registration";
		String act = driver.getTitle();
		System.out.println(act);
		
		if(act.contentEquals(expected))
		{
			System.out.println("iifl homepage opened");
		}
		else
		{
			System.out.println("iifl homepage not opened");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);//
	}

}
