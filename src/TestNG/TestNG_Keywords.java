package TestNG;

import org.testng.annotations.Test;

public class TestNG_Keywords 
{
	//5.DependsOnMethods
	@Test(timeOut = 5000)
	public void loginToApp() throws InterruptedException
	{
		Thread.sleep(6000);
		System.out.println("Running Login To App----");
	}
	
	@Test(dependsOnMethods = {"loginToApp"})
	public void VerifyPin()
	{
		System.out.println("Verify Pin TC---");
	}
	
	//4.Timeout
	@Test(timeOut = 8000)
	public void  TC5() throws InterruptedException
	{
		Thread.sleep(6000);
		System.out.println("Running Tc5---");
	}
	
	//3.enabled-false
	@Test(enabled = false)
	public void TC3()
	{
		System.out.println("Running TC3--");
	}
	@Test
	
	public void TC4()
	{
		System.out.println("Running TC4");
	}
	
	//2.Priority
		@Test(priority = 1)
		public void TC1()
		{
			System.out.println("Running TC1---");
		}
		@Test(priority = 2)
		public void TC2()
		{
			System.out.println("Running TC2---");
		}	
	
		//1.InvocationCount
		@Test(invocationCount = 10)
public void TC()
{
	System.out.println("Running TC....");
}
}
