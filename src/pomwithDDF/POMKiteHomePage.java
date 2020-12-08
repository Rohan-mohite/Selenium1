package pomwithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMKiteHomePage 
{
	
	@FindBy(xpath="//span[text()='KV']")
	private WebElement PN;
	
	
	public POMKiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void verifyPOMKiteHomePagePN()
	{
		boolean result = PN.isDisplayed();
		System.out.println(result);
		if(result)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}

	
	}

