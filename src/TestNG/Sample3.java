package TestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 
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
