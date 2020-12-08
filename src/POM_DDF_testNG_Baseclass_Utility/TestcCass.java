package POM_DDF_testNG_Baseclass_Utility;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestcCass extends Baseclass
{
	
     POMKiteLoginPage1 Log1;
     POMKiteLoginPage2 Log2;
     POMKiteHomePage h;
     int TCID;
     
     @BeforeClass
     public void openBrowser()
     {
    	 browserOpen();
    	 Log1=new POMKiteLoginPage1(driver);
    	 
    	 Log2=new POMKiteLoginPage2(driver);
    	 
    	 h=new POMKiteHomePage(driver);
    	 
     }
     @BeforeMethod
     public void LoginToApp() throws EncryptedDocumentException, IOException
     {
    	 Log1.setPOMKiteLoginPage1UN(Utility.getTestData(0,0));
    	 
    	 Log1.setPOMKiteLoginPage1PWD(Utility.getTestData(0, 1));
    	 
    	 Log1.clickPOMKiteLoginpage1Login();
    	 
    	 Log2.setPOMKiteLoginPage2Pin(Utility.getTestData(0, 2));
    	 
    	 Log2.clickPOMKiteLoginPage2Continue();
     }
     @Test
     public void verifyPN() throws EncryptedDocumentException, IOException
     {
    	 TCID=550;
    	 String actText = h.getPOMKiteHomePageverifyPN();
    	 
    	  String expText = Utility.getTestData(0, 3);    
    	 
    	Assert.assertEquals(actText, expText,"act & exp results are different");
     }
     @AfterMethod
     public void LogoutFromApp(ITestResult result) throws IOException
     {
    	 if(result.getStatus()==ITestResult.FAILURE)
    	 {
    		 Utility.captureScreenshot(driver, TCID);
    	 }
     }
     @AfterClass
     public void closeBrowser()
     {
    	 Log1=null;
    	 Log2=null;
    	 h=null;
    	 driver.close();
     }
}
