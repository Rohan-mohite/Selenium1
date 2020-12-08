package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
	@BeforeClass
	public void Openbrowser()
	{
		System.out.println("open Browser....");
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		System.out.println("Login to app....");
	}
	
	@Test
	public void Tc1()
	{
		System.out.println("running Tc1---");
	}
	
	@Test
	public void Tc2()
	{
		System.out.println("running Tc2-----");
	}
	
	@AfterMethod
	public void logoutToApp()
	{
		System.out.println("Logout To App---");
	}
	
	@AfterClass
	public void Closebrowser()
	{
		System.out.println("Close Browser....");
	}

}
