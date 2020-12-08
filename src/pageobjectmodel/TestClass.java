package pageobjectmodel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass 
{
public static void main(String[] args) throws IOException, InterruptedException {
	
	FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Selenium\\Excel sheet\\New Microsoft Excel Worksheet.xlsx\\");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("sheet3");
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	PomLoginPage1 p1 = new PomLoginPage1(driver);
	
	String UN = sh.getRow(0).getCell(0).getStringCellValue();
	
	p1.setPomLoginPage1UN();
	
	p1.setPomLoginPage1PWD();
	
	p1.clickPomLoginPage1login();
	
	PomLoginPage2 p2 = new PomLoginPage2(driver);
	
	String PWD = sh.getRow(0).getCell(1).getStringCellValue();
	
	p2.setPomLoginPage2Pin();
	
	p2.clickPomLoginPage2Continue();
	
	POMHomepage p3 = new POMHomepage(driver);
	
	p3.setPOMHomepageverifypn();
	
	Thread.sleep(2000);
	
	driver.close();
	
}
}
