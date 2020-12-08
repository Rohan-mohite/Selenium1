package pomwithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMKiteLoginPage2 
{
	 @FindBy(xpath="//input[@id='pin']")
	    private WebElement Pin;
	 
	 @FindBy(xpath="//button[text()='Continue ']")
	    private WebElement Continue;
	 
	 public POMKiteLoginPage2(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
	 public void setPOMKiteLoginPage2Pin(String pin)
	 {
		 Pin.sendKeys(pin);
	 }
	 public void clickPOMKiteLoginPage2Continue()
	 {
		 Continue.click();
	 }
	 
	 
}
