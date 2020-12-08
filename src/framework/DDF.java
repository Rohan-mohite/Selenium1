package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Selenium\\Excel sheet\\New Microsoft Excel Worksheet.xlsx\\");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet3");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String un = sh.getRow(0).getCell(0).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(un);
		
		String pswrd = sh.getRow(0).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pswrd);
		
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		 String pin = sh.getRow(0).getCell(2).getStringCellValue();
		 
		 driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
		 
		 driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		 
		 boolean result = driver.findElement(By.xpath("//span[text()='KV']")).isDisplayed();
		 
		 System.out.println(result);
		 
		 if(result)
		 {
			 System.out.println("pass");
		 }
		 else
		 {
			 System.out.println("fail");
		 }
		 
		 String search = sh.getRow(0).getCell(3).getStringCellValue();
		 
		 driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys(search);
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.close();		 
		 
		 
		 
		 

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		

	}

}
