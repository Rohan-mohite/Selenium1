package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMKiteLoginPage1 
{
    @FindBy(xpath="//input[@id='userid']")
    private WebElement UN;
    
    @FindBy(xpath="//input[@id='password']")
    private WebElement PWD;
    
    @FindBy(xpath="//button[text()='Login ']")
    private WebElement Login;
    
    public POMKiteLoginPage1(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    public void setPOMKiteLoginPage1UN(String username)
    {
    	UN.sendKeys(username);
    }
    public void setPOMKiteLoginPage1PWD(String password)
    {
    	PWD.sendKeys(password);
    }
    public void clickPOMKiteLoginpage1Login()
    {
    	Login.click();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
