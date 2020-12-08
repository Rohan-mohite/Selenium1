package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Sample1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\Admin\\Desktop\\Selenium\\Excel sheet\\New Microsoft Excel Worksheet.xlsx\\");
		
		        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		        
		        String str = RandomString.make(2);
		        
		        File dest = new File("C:\\Users\\Admin\\Desktop\\Selenium\\Screenshot\\abc_"+ str+".jpg");
		        
		        FileHandler.copy(source, dest);

	}

}
