package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLoginPage2 
{
	@FindBy(xpath="//input[@id='pin']")
	private WebElement Pin;
	
	@FindBy(xpath="//button[text()='Continue ']")
	private WebElement Continue;
	
	PomLoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setPomLoginPage2Pin()
	{
		Pin.sendKeys("959594");
	}
	public void clickPomLoginPage2Continue()
	{
		Continue.click();
	}

}
