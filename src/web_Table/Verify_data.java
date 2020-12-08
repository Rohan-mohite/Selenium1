package web_Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\Admin\\Desktop\\Selenium\\WebTable.html");
		String exp="SQL";
		       
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr"));
		        		 
		    int rowsize = row.size();
		    
		    for(int i=3;i<=rowsize;i++)
		    {
		    	int col = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[" + i +"]/td")).size();
		    	
		    	System.out.println(col);
		    	
		    	for(int j=1;j<=col;j++)
		    	{
		    		 String act = driver.findElement(By.xpath("//table[@id='1234']/tbody/tr["+i+"]/td["+j+"]")).getText();
		    		 
		    		 System.out.println(act);
		    		 
		    		 if(act.equals(exp))
		    		 {
		    			 System.out.println("given element"  +exp+"found at index"  +i+","  +j);
		    			 
		    			 break;
		    		 }
		    	}
		    }

	}

}
