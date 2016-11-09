package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import PageObjectFactory.Home;
import UtilityFiles.Driver;
import UtilityFiles.Webdrivercommonlib;

public class homepage extends Webdrivercommonlib {
	
	
	Home homepge = PageFactory.initElements(Driver.driver, Home.class);
	
	public void OpenRadialView(){
		
		homepge.getradialView().click();	
		
	}
    public void OpenTableView(){
		
		homepge.gettableView().click();	
		
	}
    public void OpenRunReports(){
		
		homepge.getReportView().click();	
		
	}
    public void OpenManageStudents(){
		
		homepge.getAdminView().click();	
		
	}
    
    public void navigateTOhome(){
    	
    	WebElement ele=homepge.NavigateHome();
    	
    	JavascriptExecutor exec=(JavascriptExecutor)Driver.driver;
    	
    	exec.executeScript("arguments[0].click();",ele);
    }
    
    public void navigateTogrpselect(){
    	
    	
    	homepge.returngroupsel().click();
    }
    
    
    public void ClickDrpdwnHome(){
    	
    	homepge.getdrpdwnhome().click();
    }

    public void ClickDrpdwnAdmin(){
    	
    	homepge.getdrpdwnadmin().click();
    }
    
    public void ClickDrpdwnReports(){
    	
    	homepge.getdrpdwnreports().click();
    }
    
    public void ClickDrpdwnUserGuide(){
    	
    	homepge.getdrpdwnUserGuide();
    }
    public void ClickDrpdwnProductTour(){
    	
    	homepge.getdrpdwnProductTour();
    }
    
    public void ClickDrpdwnLogout(){
    	
    	homepge.getdrpdwnLogout().click();
    }
   
    
    
    
    
}
