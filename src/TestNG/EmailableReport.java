package TestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EmailableReport 
{
	 @Test
      public void TC1()
      {
    	  Reporter.log("Running TC1",true);
      }
	 
	 @Test
	 public void TC2()
	 {
		 Reporter.log("Running TC2",true);
	 }
	 @Test
	 public void TC3()
	 {
		 Reporter.log("Running TC3",true);
		 Assert.fail();
     }
	 @Test
	 public void TC4()
	 {
		 Reporter.log("Running TC4",false);
	 }
}