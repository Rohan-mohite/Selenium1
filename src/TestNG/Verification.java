package TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Verification 
{
   
   @Test
    public void TC()
    {
	   Reporter.log("Running TC");
	   
	   String act="abc";
	   String exp="abc";
	   
	   Assert.assertEquals(act,exp,"actual and expected String are diff");
	  
	   
	   
    }
}
