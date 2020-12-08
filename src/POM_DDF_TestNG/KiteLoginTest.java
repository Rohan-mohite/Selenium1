package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomwithDDF.POMKiteHomePage;
import pomwithDDF.POMKiteLoginPage1;
import pomwithDDF.POMKiteLoginPage2;

public class KiteLoginTest 
{
	WebDriver driver;
	Sheet sh;
	
	POMKiteLoginPage1 p1;
	POMKiteLoginPage2 p2;
	POMKiteHomePage p3;
	@BeforeClass
  public void openBrowser() throws EncryptedDocumentException, IOException 
  {
FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Selenium\\Excel sheet\\New Microsoft Excel Worksheet.xlsx\\");
		
		 sh = WorkbookFactory.create(file).getSheet("sheet3");
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		 driver = new ChromeDriver();

		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		 p1 = new POMKiteLoginPage1(driver);
		 p2 = new POMKiteLoginPage2(driver);
	     p3 = new POMKiteHomePage(driver);
	 }
	@BeforeMethod
	public void LoginToApp()
	{
		p1.setPOMKiteLoginPage1UN(sh.getRow(0).getCell(0).getStringCellValue());
		
		p1.setPOMKiteLoginPage1PWD(sh.getRow(0).getCell(1).getStringCellValue());
		
		p1.clickPOMKiteLoginpage1Login();
		
		p2.setPOMKiteLoginPage2Pin(sh.getRow(0).getCell(2).getStringCellValue());
		
		p2.clickPOMKiteLoginPage2Continue();
	}
		
		
		@Test
		public void TC()
		{
			p3.verifyPOMKiteHomePagePN();
		}
		@AfterMethod
		public void LogoutFromApp()
		{
			
		}
		@AfterClass
		public void closeBrowser()
		{
			p1=null;
			p2=null;
			p3=null;
			driver.close();
		}
}