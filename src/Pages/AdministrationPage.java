package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import PageObjectFactory.Administration;
import UtilityFiles.Driver;

public class AdministrationPage {
	
	Administration admin = PageFactory.initElements(Driver.driver, Administration.class);
	
	
	public void Click_AddStudent(){
		
		admin.get_AddStudent().click();
	}
	
   public void Click_ShowOnlyArchived(){
		
		admin.get_ShowArhived().click();
	}
   
   public void Click_Download(){
		
		admin.get_Download().click();
	}
   
   public void Click_BackToPanelOn_AddStudents(){
	WebElement ele=admin.get_AddStudent_BackToPanel();
	JavascriptExecutor exec = (JavascriptExecutor)Driver.driver;
    exec.executeScript("arguments[0].click();", ele);
	
    }
   
   public String TotalUsers()
   {
	   String rtt = Driver.driver.findElement(By.xpath("//div[@class='admin_table']/table/tfoot/tr/th[1]/p/b")).getText();
		return rtt;
   }

   public void Click_Email()
   {
	   admin.get_Email().click();
   }
   
   public void Click_Archive()
   {
	   admin.get_Archive().click();
	   
   }
   public int get_Archivelabel(){
	   
	   List<WebElement> test = admin.get_ArchiveLabels();
	   int archives= test.size();
	   return archives;
   }
   

   public void Click_GroupDropdown()
   {
	   WebElement ele=admin.get_GroupDropdown();
		JavascriptExecutor exec = (JavascriptExecutor)Driver.driver;
	    exec.executeScript("arguments[0].click();", ele);
	   
   }
   public void Click_GroupA()
   {
	   admin.get_GroupA().click();
	   
   }
   public void Click_GroupB()
   {
	   admin.get_GroupB().click();

	   
   }
   public void Click_GroupC()
   {
	   admin.get_GroupC().click();
   
   }
   
   public void Click_SubgrpBtn()
   {
	   admin.get_SubgrpBtn().click();

	   
   }
   
   public void Click_SubgrpTextbox()
   {
	   admin.get_Subrouptextbox().click();

	   
   }
   public void Click_SubgrpSavechangesbtn()
   {
	   admin.get_SaveChangesBtn().click();

	   
   }
   
}
