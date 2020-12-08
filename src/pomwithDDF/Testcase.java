package pomwithDDF;

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

public class Testcase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Selenium\\Excel sheet\\New Microsoft Excel Worksheet.xlsx\\");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet3");
		
        ChromeOptions options = new ChromeOptions();
		
		System.out.println("--disable-notifications");
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		POMKiteLoginPage1 p1 = new POMKiteLoginPage1(driver);
		
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		
		p1.setPOMKiteLoginPage1UN(UN);
		
		String PWD = sh.getRow(0).getCell(1).getStringCellValue();
		p1.setPOMKiteLoginPage1PWD(PWD);
		
		p1.clickPOMKiteLoginpage1Login();
		
		POMKiteLoginPage2 p2 = new POMKiteLoginPage2(driver);
		
		String Pin = sh.getRow(0).getCell(2).getStringCellValue();
		p2.setPOMKiteLoginPage2Pin(Pin);
		
		p2.clickPOMKiteLoginPage2Continue();
		
		POMKiteHomePage p3 = new POMKiteHomePage(driver);
		
		p3.verifyPOMKiteHomePagePN();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
