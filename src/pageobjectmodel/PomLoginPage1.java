package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLoginPage1 
{
	//Declaration
	@FindBy(xpath="//input[@id='userid']")
	private WebElement UN;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement PWD;
	
	@FindBy(xpath="//button[text()='Login ']")
	private WebElement login;
	
	//initialization
    PomLoginPage1(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
	}
    
    //usage
    public void setPomLoginPage1UN()
    {
    	UN.sendKeys("DV1510");
    }
    public void setPomLoginPage1PWD()
    {
    	PWD.sendKeys("Vijay@123");
    }
    public void clickPomLoginPage1login()
    {
    	login.click();
    }
    
    }

