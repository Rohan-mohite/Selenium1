package POM_DDF_testNG_Baseclass_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMKiteHomePage 
{
   @FindBy(xpath="//span[text()='KV']")
	private WebElement verifyPN;
   
   public POMKiteHomePage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   public String getPOMKiteHomePageverifyPN()
   {
	   String act = verifyPN.getText();
	   
	   return act;
   }
}
