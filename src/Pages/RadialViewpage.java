package Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import PageObjectFactory.Radial;
import UtilityFiles.Driver;
import UtilityFiles.Webdrivercommonlib;

public class RadialViewpage extends Webdrivercommonlib 
{
     
	Radial radl = PageFactory.initElements(Driver.driver, Radial.class);
	
	public void openfilteroptions(){
		
		WebElement ele=radl.getFilter();
		JavascriptExecutor executor = (JavascriptExecutor)Driver.driver;
		executor.executeScript("arguments[0].click();", ele);	
	}
	
    public void Selectgroup(){
		
		
		WebElement ele=	radl.getgroup();
		JavascriptExecutor executor = (JavascriptExecutor)Driver.driver;
		executor.executeScript("arguments[0].click();", ele);
	}
		
	public void Selectsubgroup(){
		
	WebElement ele=	radl.getsubgroup();
	JavascriptExecutor executor = (JavascriptExecutor)Driver.driver;
	executor.executeScript("arguments[0].click();", ele);
	}
		
    public void Selectstudents(){
		
		radl.getstudent().click();
	}
	
    public void Selectmodules(){
		
		radl.getmodules().click();
	}
	
    public void Click_Filter_PerformGroup_A(){
    	
    	radl.get_PerformGrpA_Filter().click();
    }
    
    public void Click_Filter_PerformGroup_B(){
    	
    	radl.get_PerformGrpB_Filter().click();
    }
    
    public void Click_Filter_PerformGroup_C(){
    	
    	radl.get_PerformGrpC_Filter().click();
    }
    
    public void Click_Filter_SelectAllBtn(){
    	
    	radl.Get_SelectAllBtn().click();
    	
    }
    
    public void Click_SubgroupFilter_selectAllBtn(){
    	
    	radl.GetSubgroup_selectAllBtn().click();
    	
    }
    
    public void Click_StudentFilter_selectAllBtn(){
    	
    	radl.GetStudent_selectAllBtn().click();
    	
    }
    
    public void Click_ModulesFilter_selectAllBtn(){
    	
    	radl.GetModules_selectAllBtn().click();
    	
    }
    public void Click_SubgroupFilter_UnselectAllBtn(){
    	
    	radl.GetSubgroup_UnselectAllBtn().click();
    	
    }
    
    public void Click_StudentFilter_UnselectAllBtn(){
    	
    	radl.GetStudent_UnselectAllBtn().click();
    	
    }
    
    public void Click_ModulesFilter_UnselectAllBtn(){
    	
    	WebElement ele=radl.GetModules_UnselectAllBtn();
    	JavascriptExecutor executor = (JavascriptExecutor)Driver.driver;
    	executor.executeScript("arguments[0].click();", ele);
    	
    }
    
    public void Click_ModulesApplyBtn(){
    	
    	radl.Get_ModulesApplyBtn().click();
    	
    }
    
   public void Click_studentsApplyBtn(){
    	
    	radl.Get_studentsApplyBtn().click();
    	
    }
    
   public void Click_TableView_Link(){
    	
    	radl.GetTableView_lnk().click();
    	
    }
   public void Click_RadialView_Link(){
   	
   	radl.GetRadialView_lnk().click();
   	
   }
   
   public void Click_studentname(){
   	
   	radl.GetStudentname().click();
   	
   }
   
   public void Click_Modulename(){
	   	
	   	radl.GetMOduletname().click();
	   	
	   }
   public int TotoalStudents_RAdialView(){
	   	
	   List<WebElement> ele1 = Driver.driver.findElements(radl.Get_Studentcount());
	   
	   int count=ele1.size();
	   
	   return count;
	   }
    	
}
