package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample4 
{
	  @Test
      public void TC3()
      {
   	   Reporter.log("Running TC...");
      }
	   
	   @Test
      public void TC4()
      {
   	   Reporter.log("Running TC1...");
      }
	   @Test
      public void TC5()
      {
   	   Reporter.log("Running TC2...");
   	  //Assert.fail();
      }
}
