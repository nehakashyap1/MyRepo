package Testcases;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjectFactory.Login;
import PageObjectFactory.Radial;
import Pages.RadialViewpage;
import Pages.homepage;
import Pages.loginpage;
import UtilityFiles.Driver;
import UtilityFiles.Webdrivercommonlib;
import UtilityFiles.constant;

public class RadialViewTest {
	
	
	Login log;
	loginpage lgnpge;
	homepage hmpge;
	
	Radial rdl;
	
	Webdrivercommonlib wlib;
	
	RadialViewpage rdlpge;
	
	@BeforeClass
	public void configure(){
		
		log = new Login();
		lgnpge = new loginpage();
		hmpge = new homepage();
		
		Radial rdl = PageFactory.initElements(Driver.driver, Radial.class);
		
		rdlpge = new RadialViewpage();
		wlib = new Webdrivercommonlib();
		
		System.out.println("Test cases execution on RadialView page ");
		System.out.println("--------------------------------------");
		
	}
	
	@Test(priority=1)
	public void OpencirculerList_for_PerformtGroup_A_Student(){
		
		
		lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
		
		wlib.waitForPageToLoad();
		
		hmpge.navigateTOhome();
		
		wlib.waitForPageToLoad();
		
		hmpge.OpenRadialView();
		
		wlib.waitForPageToLoad();
		
		rdlpge.openfilteroptions();
		
		wlib.waitForPageToLoad();
		
		rdlpge.Selectgroup();
		
		rdlpge.Click_Filter_PerformGroup_A();
		wlib.waitForPageToLoad();
		String grpname = Driver.driver.findElement(By.xpath("//div/h3")).getText();
		
		System.out.println(grpname);
		
        String Expected = "Performance Tracker (Group A)";
		
		Assert.assertEquals(Expected,grpname);
		
		System.out.println("Opened Radial view for Performance Group A ");
		
	}
	
	@Test(priority=2)
	public void OpencirculerList_for_PerformtGroup_B_Student(){
        lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
		
		wlib.waitForPageToLoad();
		
		hmpge.navigateTOhome();
		
		wlib.waitForPageToLoad();
		
		hmpge.OpenRadialView();
		
		wlib.waitForPageToLoad();
		rdlpge.openfilteroptions();
		
        rdlpge.Selectgroup();
        
        WebElement ele = Driver.driver.findElement(By.xpath("//div/ul[@id='groupFilter']/li[2]/a"));
		Actions act = new Actions(Driver.driver);
		
		act.moveToElement(ele);
		ele.click();
		//rdlpge.Click_Filter_PerformGroup_B();
		wlib.waitForPageToLoad();
        String grpname = Driver.driver.findElement(By.xpath("//div/h3")).getText();
		
		System.out.println(grpname);
		
		String Expected = "Performance Tracker (Group B)";
		
		Assert.assertEquals(Expected,grpname);
		
		System.out.println("Opened Radial view for Performance Group B");
		
	}
	
	@Test(priority=3)
	public void OpencirculerList_for_PerformtGroup_C_Student(){
		
        lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
		
		wlib.waitForPageToLoad();
		
		hmpge.navigateTOhome();
		
		wlib.waitForPageToLoad();
		
		hmpge.OpenRadialView();
		
		wlib.waitForPageToLoad();
		rdlpge.openfilteroptions();
		
        rdlpge.Selectgroup();
        
        WebElement ele = Driver.driver.findElement(By.xpath("//div/ul[@id='groupFilter']/li[3]/a"));
        
      	Actions act = new Actions(Driver.driver);
      		
      	act.moveToElement(ele);
      	ele.click();
		//rdlpge.Click_Filter_PerformGroup_C();
		wlib.waitForPageToLoad();
        String grpname = Driver.driver.findElement(By.xpath("//div/h3")).getText();
		
		System.out.println(grpname);
		
        String Expected = "Performance Tracker (Group C)";
		
		Assert.assertEquals(Expected,grpname);
		
		System.out.println("Opened Radial view for Performance Group C ");
		
       
	}
	
	@Test(priority=4)
	public void Check_validationmessage_unselectall(){
		
        lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
		
		wlib.waitForPageToLoad();
		
		hmpge.navigateTOhome();
		
		wlib.waitForPageToLoad();
		
		hmpge.OpenRadialView();
		
	  	wlib.waitForPageToLoad();
			
		    rdlpge.openfilteroptions();
			
			rdlpge.Selectsubgroup();
			
			rdlpge.Click_SubgroupFilter_UnselectAllBtn();
			
			rdlpge.Selectstudents();
			
			rdlpge.Click_StudentFilter_UnselectAllBtn();
			
			rdlpge.Selectmodules();
			
			rdlpge.Click_ModulesFilter_UnselectAllBtn();
		
		    rdlpge.Click_ModulesApplyBtn();
		    
		    wlib.waitForPageToLoad();
		    
		    String message = Driver.driver.findElement(By.xpath(".//*[@id='displayMessage']/table/tbody/tr/th/h2")).getText();
		    
		   // System.out.println(message);
		    
		    String Expected = "No data to display.";
		    
		    Assert.assertEquals(Expected,message);
		    
		    System.out.println("Validation message displayed for empty data");
		    
	}
	    @Test (priority=5)
	    public void check_selectAllbtn()
	    {
	    	lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
			
			wlib.waitForPageToLoad();
			
			hmpge.navigateTOhome();
			
			wlib.waitForPageToLoad();
			
			hmpge.OpenRadialView();
			
			wlib.waitForPageToLoad();
	    		
	    		    rdlpge.openfilteroptions();
	    			
	    			rdlpge.Selectsubgroup();
	    			
	    			rdlpge.Click_SubgroupFilter_selectAllBtn();
	    			
	    			rdlpge.Selectstudents();
	    			
	    			rdlpge.Click_StudentFilter_selectAllBtn();
	    			
	    			rdlpge.Selectmodules();
	    			
	    			rdlpge.Click_ModulesFilter_selectAllBtn();
	    		
	    		    rdlpge.Click_ModulesApplyBtn();
	    		    
	    		    wlib.waitForPageToLoad();
	    		    
	    		  boolean msg =  Driver.driver.findElement(By.xpath(".//*[@id='displayMessage']/table/tbody/tr/th/h2")).isDisplayed();
	    		  
	    		  if(msg==true){
	    			  System.out.println("Select all button is not working");
	    		  }
	    		  else
	    		  {
	    			  System.out.println("Select All button is working");
	    		  }
	    		  
	    		  
	    }
	
	    @Test(priority=6)
	    public void Open_TableView_FromRadialpage(){
	    	
	    	lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
			
			wlib.waitForPageToLoad();
			
			hmpge.navigateTOhome();
			
			hmpge.OpenRadialView();
			
			wlib.waitForPageToLoad();
			
	    	rdlpge.Click_TableView_Link();
	    	 
	    	String test=wlib.verifyTitle();
	    	System.out.println(test);
	    	
	    	
	    	System.out.println("--------------------------------------");
	    	
	    }
	  //  @Test(priority=7)
	    public void Open_Radial_Table()
	    {
	    	
            lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);
			
			wlib.waitForPageToLoad();
			
			hmpge.navigateTOhome();
			
			hmpge.OpenRadialView();
			
			wlib.waitForPageToLoad();
	    	wlib.waitForPageToLoad();
	    	rdlpge.openfilteroptions();
	    	rdlpge.Selectstudents();
	    	rdlpge.Click_StudentFilter_UnselectAllBtn();
	    	rdlpge.Click_studentname();
	    	rdlpge.Selectmodules();
	    	rdlpge.Click_ModulesFilter_UnselectAllBtn();
	    	rdlpge.Click_Modulename();
	    	
	    }
	    
	    @Test(enabled=false)
	    public void Totalstudentcount(){
	    	
        lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);	
		wlib.waitForPageToLoad();	
		hmpge.navigateTOhome();	
		hmpge.OpenRadialView();		
		wlib.waitForPageToLoad();
	   	wlib.waitForPageToLoad();
	   	rdlpge.openfilteroptions();
	   	rdlpge.Selectstudents();
	   	rdlpge.Click_StudentFilter_UnselectAllBtn();
	   	rdlpge.Click_StudentFilter_selectAllBtn();
    	
	   	List<WebElement> ele1= Driver.driver.findElements(By.xpath("//div//ul[@id='studentFilter']/li[@class='filterSelected']"));	 
	    int count=ele1.size();
	   // System.out.println("Total no. of students "+count);
	    
	    rdlpge.Click_studentsApplyBtn();   	
        wlib.waitForPageToLoad();
	    List<WebElement> ele2= Driver.driver.findElements(By.xpath("//div[@id='group_tree']//*[name()='svg']/*[name()='g']/*[name()='g']"));
	    	 
	    int countrpage=ele2.size();
	   // System.out.println("Total no. of students on radial view page "+countrpage);
	    
	    
	    Assert.assertEquals("Not able to displayed all selected students on radial view page",count,countrpage);
	    
	    System.out.println(" all selected students are displayed on radial view page");
	    	 
	    }
	    
	    @Test(enabled=false)
	    public void TotalModulescount(){
	    	
        lgnpge.LoginToSonosim(constant.userName, constant.password, constant.url);	
		wlib.waitForPageToLoad();	
		hmpge.navigateTOhome();
			
		hmpge.OpenRadialView();		
		wlib.waitForPageToLoad();
	   	wlib.waitForPageToLoad();
	   	rdlpge.openfilteroptions();
	   	rdlpge.Selectmodules();
	   	rdlpge.Click_ModulesFilter_UnselectAllBtn();
	   	rdlpge.Click_ModulesFilter_selectAllBtn();
	   	 
    	List<WebElement> ele1= Driver.driver.findElements(By.xpath("//div//ul[@id='moduleFilter']/li[@class='filterSelected']"));	 
	    int count=ele1.size();
	    System.out.println("Total no. of modules selected "+count);
	    
	    rdlpge.Click_ModulesApplyBtn();  	
        wlib.waitForPageToLoad();
	    List<WebElement> ele2= Driver.driver.findElements(By.xpath("//div[@id='ksa_tree']/table/tbody/tr"));
	    	 
	    int countrpage=ele2.size();
	    System.out.println("Total no. of moduless on radial view page "+countrpage);
	    
	    
	    Assert.assertEquals("Not able to displayed all selected modules on radial view page",count,countrpage);
	    
	    System.out.println(" all selected moduless are displayed on radial view page");
	    	 
	    }
	    
	    @AfterClass
	public void Close_Test(){
		
	    	System.out.println("--------------------------------------");
	    }
}
