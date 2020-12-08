package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMHomepage 
{
	@FindBy(xpath="//span[text()='KV']")
	private WebElement verifypn;
	
	POMHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setPOMHomepageverifypn()
	{
		boolean result = verifypn.isDisplayed();
		
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
