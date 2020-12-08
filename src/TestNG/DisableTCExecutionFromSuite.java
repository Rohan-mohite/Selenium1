package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DisableTCExecutionFromSuite 
{
	@Test
    public void TC()
    {
 	   Reporter.log("Running TC...");
    }
	   
	   @Test
    public void TC1()
    {
 	   Reporter.log("Running TC1...");
    }
	   @Test
    public void TC2()
    {
 	   Reporter.log("Running TC2...");
 	  
    }
}
