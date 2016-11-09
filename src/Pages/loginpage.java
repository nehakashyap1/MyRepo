package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import PageObjectFactory.Login;
import UtilityFiles.Driver;
import UtilityFiles.Webdrivercommonlib;

public class loginpage extends Webdrivercommonlib {
	
	
	
	Login loginpge = PageFactory.initElements(Driver.driver, Login.class);
	
	public void LoginToSonosim(String username, String password, String url)
	{
		
			Driver.driver.get(url);
			Driver.driver.manage().window().maximize();
			waitForPageToLoad();
		

		loginpge.getusername().sendKeys(username);
		loginpge.getpassword().sendKeys(password);
		WebElement ele=Driver.driver.findElement(By.xpath("//div/button[@type='submit']"));
		JavascriptExecutor executor = (JavascriptExecutor)Driver.driver;
		executor.executeScript("arguments[0].click();", ele);
		
        
	}
	
	public void ClickuserDropdwn(){
		
		
		loginpge.userdrpdown().click();
		
	}
	
	public void logoutSonosim(){
		
		loginpge.getlogout().click();
		
	}

}