package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import PageObjectFactory.Groupview;
import PageObjectFactory.Login;
import UtilityFiles.Driver;
import UtilityFiles.Webdrivercommonlib;

public class GroupselectPage {
	
	
	
	Groupview grp = PageFactory.initElements(Driver.driver, Groupview.class);
	
	public void Click_PerformGroupA(){
		WebElement ele=grp.get_performGrpA();
		JavascriptExecutor exe = (JavascriptExecutor)Driver.driver;
		exe.executeScript("arguments[0].click();", ele);
		
		
	}
	
    public void Click_PerformGroupB(){
    	WebElement ele=grp.get_performGrpB();
		JavascriptExecutor exe = (JavascriptExecutor)Driver.driver;
		exe.executeScript("arguments[0].click();", ele);
	}

    public void Click_PerformGroupC(){
    	WebElement ele=grp.get_performGrpC();
		JavascriptExecutor exe = (JavascriptExecutor)Driver.driver;
		exe.executeScript("arguments[0].click();", ele);
    	
    }
	
	

}
